import java.util.Scanner;

public class SingletonTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first log message: ");
        String message1 = sc.nextLine();

        Logger logger1 = Logger.getInstance();
        logger1.log(message1);

        System.out.print("Enter second log message: ");
        String message2 = sc.nextLine();

        Logger logger2 = Logger.getInstance();
        logger2.log(message2);

        if (logger1 == logger2) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nDifferent Logger instances exist.");
        }

        sc.close();
    }
}