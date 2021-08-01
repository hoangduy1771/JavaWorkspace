package JavaFileClass;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
////        Detect to see if secret_message.txt exist in the project
//        File file = new File("secret_message.txt");
//
//        if (file.exists()) {
//            System.out.println("The file exist");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
////            File and folder is different
//            System.out.println(file.isFile());
////            file.delete();
//
//        } else {
//            System.out.println("Can't find any file");
//        }


//        Write a file
//        try {
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("Roses are red \nViolets are blue \nIf you were a flower \nI'd pick you ");
//            writer.append("\n-A poem");
//            writer.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Read a file
//        try {
//            FileReader reader = new FileReader("art.txt");
//            int data = reader.read();
//
//            while (data != -1) {
//                System.out.print((char) data);
//                data = reader.read();
//
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Java audio

        Scanner scanner = new Scanner(System.in);
        File file = new File("ForTheGloryWav.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equalsIgnoreCase("q")) {
            System.out.println("Press P to play, S to pause, R to reset, and Q to quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();

            switch (response) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    clip.start();
                    break;
                case ("q"):
                    clip.close();
                default:
                    System.out.println("Wrong input");
            }


        }


    }
}


















