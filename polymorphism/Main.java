package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Using polymorphism
        Car bugatti = new Bugatti("Bugatti Veyron", 310, "Italy");
        Car toyota = new Toyota("Toyota Camry", 220, "Japan");

        System.out.println("My car: " + bugatti.getModel() + ", speed: " + bugatti.getSpeed());
        System.out.println("-----------------------------------------------------------");
        System.out.println("My car: " + toyota.getModel() + ", speed: " + toyota.getSpeed());

    }
}
