package CustomException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the liquor store.");
        System.out.println("How old are you?");
        int age = scanner.nextInt();


        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occur: " + e);
        }


    }

    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("You're not old enough to purchase this liquor yet");
        } else {
            System.out.println("That will be 10$ for a bottle");
        }

    }


}
