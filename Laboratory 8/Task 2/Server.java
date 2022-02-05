import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Server {

    String host = "127.0.0.1";
    int port = 8080;
    Socket socket;
    ServerSocket serverSocket;
    File outputFile = new File("Laboratory 8/Task 2/OutputFile");
    File rubaiyatFile = new File("Laboratory 8/Task 2/Rubaiyat.txt");


    public void run() throws IOException {
//        Создаем сокет
        serverSocket = new ServerSocket(port);

        System.out.println("Сервер запущен. Адрес = " + host + ", порт = " + port);
//      Принимаем подключение
        socket = serverSocket.accept();
//      Получаем данные
        receiveData();
//      Отправляем ответ
        sendAnswer();

        System.out.println("Сервер завершил работу.");
//      Закрываем сокет
        serverSocket.close();

    }

    public void receiveData() throws IOException {


        InputStream input = socket.getInputStream();
//      Вход - канал сокета
        OutputStream output;
//        Выход - файл
        try {
            output = new FileOutputStream(outputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Принимаю файл...");
        try {
//            Получаем данные из канала и записываем в файл
            int symbol;
            while ((symbol = input.read()) != -1) {
                output.write(symbol);
            }
            System.out.println("Файл успешно принят.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            input.close();
            output.close();
        }

    }

    public void sendAnswer() throws IOException {
//      Получаем рубаи
        String rubaiyat = getRubaiyat();
//      Принимаем подключение
        socket = serverSocket.accept();

        System.out.println("Отправляю рубаи...");
        PrintStream printStream = new PrintStream(socket.getOutputStream());
//        Отправляем рубаи
        printStream.print(rubaiyat);
        printStream.flush();
        System.out.println("Рубаи отправлен...");
        socket.close();
    }

    public String getRubaiyat() throws IOException {
        System.out.println("Выбираю случайный рубаи...");
        File file = new File("Laboratory 8/Task 2/Rubaiyat.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
//        Записываем содержимое файла в список
        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }
//        Получаем случайный элемент списка
        int randomIndex = new Random().nextInt(list.toArray().length);
        System.out.println("Рубаи выбран.");
        return list.get(randomIndex);
    }
}
