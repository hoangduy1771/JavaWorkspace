package ObjectCopying;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Toyota", 2000);

//        copy before instantiate new object
        Car car2 = new Car(car1);

//        copy after instantiate a new object
//        Car car2 = new Car("Lamborghini", "Aventador", 2021);
//        car1.copy(car2);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());


    }
}
