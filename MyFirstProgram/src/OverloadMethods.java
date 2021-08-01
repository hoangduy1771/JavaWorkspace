public class OverloadMethods {

    public static void main(String[] args) {
        System.out.println(add(1.0, 2.0, 3.0, 4.0));

    }

    static int add(int a, int b) {
        int sum = a + b;
        System.out.println("You're using overloaded method 1");
        return sum;
    }

    static int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("You're using overloaded method 2");
        return sum;
    }

    static int add(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("You're using overloaded method 3");
        return sum;
    }

    static double add(double a, double b) {
        double sum = a + b;
        System.out.println("You're using overloaded method 4");
        return sum;
    }

    static double add(double a, double b, double c) {
        double sum = a + b + c;
        System.out.println("You're using overloaded method 5");
        return sum;
    }

    static double add(double a, double b, double c, double d) {
        double sum = a + b + c + d;
        System.out.println("You're using overloaded method 6");
        return sum;
    }

}

























