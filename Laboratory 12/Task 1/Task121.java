import java.util.Scanner;

public class Task121 {
//    Точка входа
    public static void main(String[] args) {
//      Создание членов банды
        Gang gang = new Gang();
        Agent agent = new Agent();
        Boss boss = new Boss();
        Person carrier = new Carrier();
        Person cracker = new Cracker();
        Person driver = new Driver();
//      Добавление людей в банду
        cracker.enterGang(gang);
        carrier.enterGang(gang);
        boss.enterGang(gang);
        driver.enterGang(gang);
//      Добавление агента
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите ли вы добавить агента? (y/n): ");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            agent.enterGang(gang);
        }

        boss.beginRobbery();

    }
}
