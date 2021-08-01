package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter x: ");
            int x = scanner.nextInt();

            System.out.println("Enter y: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result x / y = " + z);

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("Wrong data type");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
        }

    }
}
