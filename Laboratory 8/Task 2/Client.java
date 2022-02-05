import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    String host = "127.0.0.1";
    int port = 8080;
    Socket socket;

    public void run() throws IOException {
//        Создаем сокет
        socket = new Socket(host, port);
        System.out.println("Клиент запущен. Адрес = " + host + ", порт = " + port);

        Scanner scanner = new Scanner(System.in);
//      Открываем файл
        File file = new File(scanner.nextLine());
//      Отправляем файл
        sendFile(file);
//      Получаем ответ
        receiveAnswer();
    }

    public void sendFile(File file) throws IOException {
//      Вход - файл
        InputStream input;
        try {
            input = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
//      Выход - канал сокета
        OutputStream output;
        try {
            output = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Отправляю файл...");
        try {
//            Считываем файл и записываем в канал сокета
            int symbol;
            while ((symbol = input.read()) != -1) {
                output.write(symbol);
            }
            System.out.println("Файл успешно отправлен.");

        } catch (IOException e) {
            e.printStackTrace();
        }
//        Закрываем файл и вывод в сокет
        finally {
            input.close();
            output.close();
        }

    }

    public void receiveAnswer() throws IOException {
//        Создаем сокет
        socket = new Socket(host, port);
        System.out.println("Соединение установлено!");
        System.out.println("Получаю ответ от сервера...\n");
//        Получаем данные из сокета
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
        System.out.println("Ответ получен.\n");
        System.out.println("\nОтключение...");
//        Закрываем сокет
        socket.close();
    }
}
