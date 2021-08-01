import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = null;
        FileInputStream fileIn = new FileInputStream("F:\\work\\Workspace\\Java\\Java Workspace\\Serialization\\UserInfo.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        user = (User) objectIn.readObject();
        objectIn.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.accountNumber);
        System.out.println(user.balance);
        user.mainPage();

    }
}
