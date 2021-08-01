public class Friend {
    static int numberOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriend() {
        System.out.println("You have " + numberOfFriends + " friends");
    }

}
