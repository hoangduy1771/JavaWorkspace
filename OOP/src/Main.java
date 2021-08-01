public class Main {
    public static void main(String[] args) {

////        Create object from a class
//        Cars myCar = new Cars();
//
////        Access object attributes
//        System.out.println(myCar.make);
//        System.out.println(myCar.model);
//
////        Access object methods
//        myCar.drive();
//        myCar.brake();


//        Use constructor to create object from class
        Human human1 = new Human("Jeremy Wade", 56, 70.5);
        Human human2 = new Human("John Wick", 45, 85.5);
        System.out.println(human1.name);

        human2.eating();


//        Overloaded constructor
//        pizza making example

//        Pizza pizza1 = new Pizza("thin crust", "tomato", "squid");
//
//        System.out.println("Here is your the ingredients that you picked: ");
//        System.out.println(pizza1.bread);
//        System.out.println(pizza1.sauce);
//        System.out.println(pizza1.topping);

//        toString methods
//        overwriting toString method in an object
//        Motorcycle motor1 = new Motorcycle();

//        call explicitly
//        System.out.println(motor1.toString());
//        call implicitly
//        System.out.println(motor1);


//        Array of objects - food
//        Food foodItem1 = new Food("Gumbo", 100);
//        Food foodItem2 = new Food("Surf and Turf", 150);
//        Food foodItem3 = new Food("Meaty stew", 75);
//
//        Food[] iceBox = new Food[3];
//
//        iceBox[0] = foodItem1;
//        iceBox[1] = foodItem2;
//        iceBox[2] = foodItem3;
//
//        for (int i = 0; i < iceBox.length; i++) {
//            System.out.println(iceBox[i].name);
//            System.out.println(iceBox[i].price);
//        }

//        Object passing using Zoo and Animal

//        Zoo zoo1 = new Zoo();
//
//        Animal animal1 = new Animal("Lion");
//        Animal animal2 = new Animal("Elephant");
//
//        zoo1.received(animal1);
//        zoo1.received(animal2);

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriend();

    }
}






















