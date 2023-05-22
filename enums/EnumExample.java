package enums;


// Initializing enums outside class
enum FootballClubs {ZENIT, SPARTAK, CSKA};

public class EnumExample {

    // Initializing enums inside class
    enum CoffeeSize {
        SMALL(60), MEDIUM(120), BIG(180);
        int milliliters;

        CoffeeSize(int i) {
            this.milliliters = i;
        }

        int getMilliliters() {
            return milliliters;
        }
    }

    public static void main(String[] args) {
        // Using enums
        FootballClubs footballClubs1 = FootballClubs.ZENIT;
        FootballClubs footballClubs2 = FootballClubs.SPARTAK;
        FootballClubs footballClubs3 = FootballClubs.CSKA;

        // Display in output
        System.out.println(footballClubs1);
        System.out.println(footballClubs2);
        System.out.println(footballClubs3);

        // Using enums
        CoffeeSize coffeeSize1 = CoffeeSize.SMALL;
        CoffeeSize coffeeSize2 = CoffeeSize.MEDIUM;
        CoffeeSize coffeeSize3 = CoffeeSize.BIG;

        // Display in output
        System.out.println(coffeeSize1.getMilliliters());
        System.out.println(coffeeSize2.getMilliliters());
        System.out.println(coffeeSize3.getMilliliters());

    }
}
