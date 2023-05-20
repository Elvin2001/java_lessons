package encapsulation;

public class Test {
    public static void main(String[] args) {
        // Creating object
        Car car = new Car();

        // Using setters and getters with safety access for object fields
        car.setModel("BMW");
        car.setPrice(1304.355);
        System.out.print("Car model = " + car.getModel() + ", price = " + car.getPrice());
    }
}
