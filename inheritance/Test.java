package inheritance;

public class Test {
    public static void main(String[] args) {

        // Creating objects from child classes
        Samsung samsung = new Samsung("Samsung Galaxy A50", "South Korea", 765);
        Iphone iphone = new Iphone("Iphone 13 Pro Max", "USA", 1200);
        Xiaomi xiaomi = new Xiaomi("Xiaomi Redmi Note 3", "China", 850);

        // Using overriding method of parent class
        samsung.showInfo();
        iphone.showInfo();
        xiaomi.showInfo();
    }
}
