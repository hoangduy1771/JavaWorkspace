package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lamborghini", "Aventador", 2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setMake("Honda");
        car.setModel("Toyota");
        car.setYear(2025);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
