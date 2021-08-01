package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

//        Created an array of object using polymorphism - which is car, bicycle, boat all inherited from Vehicle
        Vehicle[] racers = {car, bicycle, boat};


//        car.go();
//        bicycle.go();
//        boat.go();

        for (Vehicle racer : racers) {
            racer.go();
        }

    }
}
