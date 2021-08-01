public class Motorcycle {
    String brand = "BMW";
    String model = "R nineT Pure";
    String color = "blue";
    double price = 10000;
    int year = 2020;

    public String toString() {
        String objectString =
                "{" + "\n" +
                        "brand: " + brand + ";" + "\n" +
                        "model: " + model + ";" + "\n" +
                        "color: " + color + ";" + "\n" +
                        "price: " + price + ";" + "\n" +
                        "year: " + year + ";" + "\n" +
                        "}";

        return objectString;
    }


}
