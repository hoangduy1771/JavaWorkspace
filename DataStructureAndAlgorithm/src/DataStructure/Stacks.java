package DataStructure;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> gameStack = new Stack();

        gameStack.push("Sekiro");
        gameStack.push("Don't Starve: Shipwrecked");
        gameStack.push("Oxygen Not Included");
        gameStack.push("Darkest Dungeon");
        gameStack.push("Ori");
        gameStack.push("Hades");

//        String poppedGame = gameStack.pop();
//        System.out.println(poppedGame);

        System.out.println(gameStack.peek());

        for (int i = 0; i <= 100; i++) {
            gameStack.push("Don't starve " + i);
        }

        System.out.println(gameStack);



    }

}
