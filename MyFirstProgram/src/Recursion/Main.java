package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step counting
        Scanner scanner = new Scanner(System.in);
        System.out.println("How far do you want to walk? (meters)");
        int distance = scanner.nextInt();

        walk(0, distance);

        scanner.close();
    }

    static void walk(int step, int distance) {

        if (distance > 0) {
            step++;
            distance--;
            System.out.println("You take a step: " + step + " meter/s");
            walk(step, distance);
        } else {
            System.out.println("You're done walking :)");
        }

    }

}
