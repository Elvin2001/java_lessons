package polymorphism;

public class Car {
    private String model;
    private double speed;
    private String country;

    public Car(String model, double speed, String country) {
        this.model = model;
        this.speed = speed;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }
}
