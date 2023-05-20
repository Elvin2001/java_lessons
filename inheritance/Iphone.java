package inheritance;

public class Iphone extends Phone {
    public Iphone(String model, String countryProducer, int price) {
        super(model, countryProducer, price);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
