import java.util.*;

public class ArrayList2D {

    public static void main(String[] args) {
        //        ArrayList
//        ArrayList<String> seafood = new ArrayList<String>();
//
//        seafood.add("Mussel");
//        seafood.add("Caviar");
//        seafood.add("Crab");
//        seafood.add("Lobster");
//        seafood.add("Salmon");
//        seafood.add("Tuna");
//
//        seafood.set(0, "Shrimp");
//        seafood.remove(4);
//
//        System.out.println(seafood);
//        for (int i = 0; i < seafood.size(); i++) {
//            System.out.println(seafood.get(i));
//        }

        ArrayList<String> vegetableList = new ArrayList();
        vegetableList.add("Cabbage");
        vegetableList.add("Carrot");
        vegetableList.add("Onion");
        vegetableList.add("Mushroom");
        vegetableList.add("Potato");

//        System.out.println(vegetableList);
//        System.out.println(vegetableList.get(2));

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("Coffee");
        drinkList.add("Iced tea");
        drinkList.add("Cocoa");

        ArrayList<String> seafoodList = new ArrayList();
        seafoodList.add("Scallop");
        seafoodList.add("Prawn");
        seafoodList.add("Tuna");
        seafoodList.add("Mackerel");

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(vegetableList);
        groceryList.add(drinkList);
        groceryList.add(seafoodList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(1).get(1));


    }
}
