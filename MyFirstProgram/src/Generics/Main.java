package Generics;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = {"Seal", "Dolphin", "Orca", "Penguin", "Whale"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'S', 'D', 'O', 'P', 'W'};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};

//        display(stringArray);
//        display(intArray);
//        display(charArray);
//        display(doubleArray);

        System.out.println(getFirst(stringArray));
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(doubleArray));

    }

    public static <Type> void display(Type[] typeArray) {

        for (Type x : typeArray) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static <Type> Type getFirst(Type[] typeArray) {

        return typeArray[0];
    }

}
