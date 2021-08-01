public class Methods {

    public static void main(String[] args) {
//        String value = "World";
//        int num = 10;
//        hello(value, num);

        System.out.println(add(3, 4));

    }

    static void hello(String someString, int someNum) {
        System.out.println("Hello " + someString + " " + someNum);
    }

    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

}
