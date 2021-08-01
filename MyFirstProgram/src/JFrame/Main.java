package JFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        First way to Create JFrame is by creating an instance of it

//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setTitle("A program title");
//        frame.setSize(500, 500);
//
////        Choose default for close X button:
////        JFrame.HIDE_ON_CLOSE
////        JFrame.DO_NOTHING_ON_CLOSE
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////        set icon
//        ImageIcon img = new ImageIcon("icon.jpg");
//        frame.setIconImage(img.getImage());
//
////        Change pane background color
////        Color value choose from library
////        frame.getContentPane().setBackground(Color.darkGray);
//
////        Custom color value
////        frame.getContentPane().setBackground(new Color(55, 58, 89));
////        Hexadecimal value : 0x and 6 figure following
//        frame.getContentPane().setBackground(new Color(0xbd92f9));


//        Second way to create a JFrame is to create a subclass of JFrame
//        if intended to modify or add something new. do set a name for MyFrame instance
//        MyFrame myFrame = new MyFrame();
        new MyFrame();


    }
}






















