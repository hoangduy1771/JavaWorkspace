package JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setVisible(true);
        this.setTitle("A program title");
        this.setSize(500, 500);

//        Choose default for close X button:
//        JFrame.HIDE_ON_CLOSE
//        JFrame.DO_NOTHING_ON_CLOSE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        set icon
        ImageIcon img = new ImageIcon("icon.jpg");
        this.setIconImage(img.getImage());

//        Change pane background color
//        Color value choose from library
//        this.getContentPane().setBackground(Color.darkGray);

//        Custom color value
//        this.getContentPane().setBackground(new Color(55, 58, 89));
//        Hexadecimal value : 0x and 6 figure following
        this.getContentPane().setBackground(new Color(0xbd92f9));

    }

}
