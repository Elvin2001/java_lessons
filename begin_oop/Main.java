package begin_oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Initializing object
        LocalDate date = LocalDate.of(2001, 1, 23);
        Human human = new Human("Elvin", "Abaev", "Jalalovich", date, 'M', 79.6, 1.78);
        System.out.println(human);
        System.out.println();

        // Using object methods
        human.goToShop();
        human.buyMilk();
        human.buyBread();
        human.backToHome();
    }
}
