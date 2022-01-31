import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Auth auth = new Auth("hard_password");
        Scanner scan = new Scanner(System.in);
        System.out.print("Type password here: ");
        String password = scan.nextLine();
        if (auth.check(password)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Sorry, try again.");
        }
    }
}
