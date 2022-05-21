package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> lineOfPeople = new LinkedList<String>();



        lineOfPeople.offer("Robert Downey Jr");
        lineOfPeople.offer("Tom Cruise");
        lineOfPeople.offer("Brad Pitt");
        lineOfPeople.offer("Chris Evans");
        lineOfPeople.offer("Steve Carell");

        //        useful method inherited from Collection class
        System.out.println(lineOfPeople.isEmpty());
        System.out.println(lineOfPeople.size());
        System.out.println(lineOfPeople.contains("Tom Cruise"));

//        lineOfPeople.poll();
//        lineOfPeople.poll();
//        System.out.println(lineOfPeople.peek());
//        System.out.println(lineOfPeople);



    }
}
