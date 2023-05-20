package inheritance;

public class Xiaomi extends Phone {
    public Xiaomi(String model, String countryProducer, int price) {
        super(model, countryProducer, price);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
