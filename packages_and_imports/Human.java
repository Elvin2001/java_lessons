// using package
package packages_and_imports;

// import classes from other package

import packages_and_imports.transport.*;

public class Human {

    // State
    private String givenName;
    private String surName;
    private Car myCar;
    private Car dadCar;
    private Plane ourPlane;


    public Human(Car myCar, Car dadCar, Plane ourPlane) {
        this.myCar = myCar;
        this.dadCar = dadCar;
        this.ourPlane = ourPlane;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

    public Car getDadCar() {
        return dadCar;
    }

    public void setDadCar(Car dadCar) {
        this.dadCar = dadCar;
    }

    public Plane getOurPlane() {
        return ourPlane;
    }

    public void setOurPlane(Plane ourPlane) {
        this.ourPlane = ourPlane;
    }

    public static void main(String[] args) {
        // Create objects
        Car dadCar = new Car("BMW", 1240500, 2017);
        Car myCar = new Car("Mercedes", 1344933, 2019);
        Plane plane = new Plane("SuperJet", 240003030, 2021);

        // Inject objects in constructor
        Human person = new Human(myCar, dadCar, plane);
    }
}
