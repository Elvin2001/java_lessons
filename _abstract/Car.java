package _abstract;

// Abstract access modifier on class
public abstract class Car {
    protected int speed = 14;

    // Abstract access modifier on method
    public abstract int run();

    public void stop() {
        speed = 0;
        System.out.println(speed);
    }

}
