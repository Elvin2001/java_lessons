package packages_and_imports.transport;

public class Car {
    private String model;
    private double price;
    private int yearOfRelease;

    public Car(String model, double price, int yearOfRelease) {
        this.model = model;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
