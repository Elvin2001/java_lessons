package inheritance;

public abstract class Phone {

    private String model;
    private String countryProducer;
    private int price;

    public Phone(String model, String countryProducer, int price) {
        this.model = model;
        this.countryProducer = countryProducer;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("My phone: " + model + ", price: " + price);
    }


}
