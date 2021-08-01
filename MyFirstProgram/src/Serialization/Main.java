package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User("John", 15975354, 100000);

        user.mainPage();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

    }

}
