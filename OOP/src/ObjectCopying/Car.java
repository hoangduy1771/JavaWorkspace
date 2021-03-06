package ObjectCopying;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    Car(Car car) {
        this.copy(car);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }

}















