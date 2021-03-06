package Deserialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user;
        FileInputStream fileIn = new FileInputStream("F:\\work\\Workspace\\Java\\Java Workspace\\MyFirstProgram\\UserInfo.ser");
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
