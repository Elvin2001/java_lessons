package inheritance;

public class Samsung extends Phone {
    public Samsung(String model, String countryProducer, int price) {
        super(model, countryProducer, price);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
