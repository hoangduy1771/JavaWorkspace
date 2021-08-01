import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.util.Random;

public class GUI {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        String name = JOptionPane.showInputDialog("Enter your name:");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        // Hypotenuse calculator
//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Opposite: ");
//        x = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter Adjacent: ");
//        y = Double.parseDouble(scanner.nextLine());
//
//        z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//        System.out.println("Hypotenuse is " + z);
//        scanner.close();

//        Switch
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a day: ");
//        String day = scanner.nextLine();
//        switch (day) {
//            case "monday" -> System.out.println("It's Monday, weekends in so short");
//            case "tuesday" -> System.out.println("It's Tuesday, i have some important tasks to plan today");
//            case "wednesday" -> System.out.println("It's Wednesday, Chocolate day");
//            case "thursday" -> System.out.println("It's Thursday, i have some important tasks to plan today");
//            case "friday" -> System.out.println("It's Friday, last work day in the week, feeling excited");
//            case "saturday" -> System.out.println("It's Saturday, what should i do today to relax?");
//            case "sunday" -> System.out.println("It's Sunday, better go to sleep early tonight");
//            default -> System.out.println("That is not a day");
//        }

//        Logical Operators
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Press Q or q and Enter to quit");
//        String response = scanner.next();
//
//        if (response.equals("Q") || response.equals("q")) {
//            System.out.println("You quit the game.");
//        } else {
//            System.out.println("You still playing the game.");
//        }

//        Loops
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (name.isBlank()) {
//            System.out.print("Please type in your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello " + name);

//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//            if (i == 0) {
//                System.out.println("End of loop");
//            }
//        }

        // Nested loops
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter numbers of Rows you want: ");
//        int rows = scanner.nextInt();
//        System.out.println("Enter numbers of Columns you want: ");
//        int columns = scanner.nextInt();
//        System.out.println("Enter the Symbol you want to display the rectangle with: ");
//        String symbol = scanner.next();
//
//        for (int i = 0; i < rows; i++) {
//            System.out.println();
//            for (int j = 0; j < columns; j++) {
//                System.out.print(symbol);
//            }
//        }

//        Array
//        String[] cars = {"Ford", "Mustang", "Tesla", "Lamborghini"};
//        System.out.println(cars[0]);

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

//        another way to initialize array
//        String[] ships = new String[5];
//        ships[0] = "Container Ship";
//        ships[1] = "Bulk Carrier";
//        ships[2] = "Tanker Ship";
//        ships[3] = "Container Ship";
//        ships[4] = "Naval Ship";
////        System.out.println(ships[4]);
//
//        for (String ship : ships) {
//            System.out.println(ship);
//        }

//        2D Array
//        1st way to initialize 2d Array
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Ford";
//        cars[0][1] = "Mustang";
//        cars[0][2] = "Toyota";
//        cars[1][0] = "Ranger";
//        cars[1][1] = "Chevrolet";
//        cars[1][2] = "Mercedes";
//        cars[2][0] = "Honda";
//        cars[2][1] = "Lamborghini";
//        cars[2][2] = "Audi";

//        2nd way to initialize 2d Array
//        String[][] cars = {
//                {"Ford", "Mustang", "Toyota"},
//                {"Ranger", "Chevrolet", "Mercedes"},
//                {"Honda", "Lamborghini", "Audi"}
//        };
//
////        Access rows of Array
//        System.out.println(cars.length);
////        Access columns of Array
//        System.out.println(cars[0].length);
//
//        for (int row = 0; row < cars.length; row++) {
//            System.out.println();
//            for (int column = 0; column < cars[row].length; column++) {
//                System.out.print(cars[row][column] + " ");
//
//            }
//        }

//        for each loops
        String[] greekGods = {"Zeus", "Hades", "Poseidon", "Athena", "Ares", "Aphrodite", "Demeter", "Dionysus"};

        for (String greekGod : greekGods) {
            System.out.println(greekGod);
        }

        ArrayList<String> greekGodsWeapons = new ArrayList();
        greekGodsWeapons.add("Thunderbolt");
        greekGodsWeapons.add("Trident");
        greekGodsWeapons.add("Bident");
        greekGodsWeapons.add("Aegis");
        greekGodsWeapons.add("Thyrsus");

//        System.out.println(greekGodsWeapons);
        for (String weapons : greekGodsWeapons) {
            System.out.println(weapons);
        }


    }
}




















