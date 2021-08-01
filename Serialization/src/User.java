import java.io.Serializable;

public class User implements Serializable {
    String name;
    int accountNumber;
    long balance;

    public User(String name, int accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void mainPage() {
        System.out.println("Welcome to our Bank, " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + "$");
    }


}
