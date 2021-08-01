package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want to create?");
        System.out.print("Type 1 to create a Dog and 2 to create a Cat: ");

        int choice = scanner.nextInt();


        while (choice != 1 && choice != 2) {
            animal = new Animal();
            animal.speak();
            System.out.print("No animal created. Type again: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                animal = new Dog();
                animal.speak();
            } else if (choice == 2) {
                animal = new Cat();
                animal.speak();
            }

        }

//        switch (choice) {
//            case 1:
//                animal = new Dog();
//                animal.speak();
//                break;
//            case 2:
//                animal = new Cat();
//                animal.speak();
//                break;
//            default:
//                animal = new Animal();
//                System.out.println("No animal created");
//                animal.speak();
//        }


    }

}
