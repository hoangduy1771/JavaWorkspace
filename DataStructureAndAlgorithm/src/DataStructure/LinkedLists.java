package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> alphabet = new LinkedList<>();

//        Treating LinkedList like a Queue
        alphabet.offer("A");
        alphabet.offer("B");
        alphabet.offer("C");
        alphabet.offer("D");
        alphabet.offer("F");
        alphabet.offer("G");

//        alphabet.poll();

//        Treating LinkedList like a Stack
//        alphabet.push("H");
//        alphabet.push("I");
//        alphabet.push("K");
//        alphabet.push("L");
//        alphabet.push("N");
//
//        alphabet.pop();

        alphabet.add(4, "E");
        alphabet.remove("G");

//        useful methods
//        System.out.println(alphabet.indexOf("C"));
//        System.out.println(alphabet.peekFirst());
//        System.out.println(alphabet.peekLast());
//        alphabet.addFirst("Z");
//        alphabet.addLast("T");
//        alphabet.removeFirst();
//        alphabet.removeLast();

//        alphabet.addAll(1, alphabet);

        System.out.println(alphabet);
    }

}















