public class Pizza {
    String bread;
    String sauce;
    String topping;
    String cheese;

    Pizza(String bread, String sauce, String topping, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;
    }

}
