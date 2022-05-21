package DataStructure;

public class BigONotation {
    public static void main(String[] args) {
        addUp(5);
    }

      static int addUp(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
        return sum;
    }
}
