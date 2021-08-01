package SuperKeyword;

public class Hero extends Person {

    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;

    }

    public String summary() {
        return super.summary() + "\n" + this.power;
    }

}
