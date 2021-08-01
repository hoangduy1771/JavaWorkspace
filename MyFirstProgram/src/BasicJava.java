import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class BasicJava {

    public static void main(String[] args) {

//		System.out.println("I love ice-cream");
//		System.out.println("There is always room for ice-cream");
//		System.out.println("");
//
//		int x = 123;
//
//		System.out.println("my number is " + x);
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Hello, What's your name? ");
//		String name = scanner.nextLine();
//
//		System.out.println("How old are you?");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//
//		System.out.println("What's your favorite food?");
//		String food = scanner.nextLine();
//
//		System.out.println("Hello, " + name);
//		System.out.println("You are " + age + " years old");
//		System.out.println("You like to eat " + food);

//		float friends = 10;
//		friends = friends / 3;
//		System.out.println(friends);

//        Math class
//        double x = 3.14;
//        double y = -10;
//        double z = 12;
//
//        System.out.println("Max: " + Math.max(x, y));
//        System.out.println("Min: " + Math.min(x, y));
//        System.out.println("Absolute: " + Math.abs(y));
//        System.out.println("Square root " + Math.sqrt(z));
//        Random random = new Random();
//
//
////        Random Number
//        int randomNumber = random.nextInt(30 - 1) + 1;
//        System.out.println(randomNumber);

//        String methods
//        String name = "Duy";

//        boolean result = name.equals("Duy");
        // ignore case sensitive
//        boolean result = name.equalsIgnoreCase("duy");
        // print out character at index
//        char result = name.charAt(2);
//        int result = name.indexOf("D");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        System.out.println(result);

//        String location = "     Viet nam     ";
//        System.out.println(location.trim());

//        String quote = "The atheist staring from his attic window is often nearer to God than the believer caught up in his own false image of God.";
//        System.out.println(quote.replace("a", "o"));

        // Wrapper classes
//        Boolean conclusion = true;
//        System.out.println(conclusion);

//        printf()
//        % is the format specifier

//        System.out.printf("This is a format string %d", 123);

        boolean myBoolean = true;
        int myInt = 10;
        char myChar = '*';
        String myString = "river";
        double myDouble = 7000000;

//        conversion character
        System.out.printf("This gonna display my boolean in here: %b %n", myBoolean);
        System.out.printf("This gonna display my integer in here: %d %n", myInt);
        System.out.printf("This gonna display my char  here: %c %n", myChar);
        System.out.printf("This gonna display my string in here: %s %n", myString);
        System.out.printf("This gonna display my double in here: %f %n", myDouble);

//        width
        System.out.printf("This string after this gonna have a width of 10 spaces %10s %n", myString);
        System.out.printf("This string after this gonna have a width of -10 spaces %-10s %n", myString);

//        precision
        System.out.printf("You have this much money %,015.2f $", myDouble);
    }

}






























