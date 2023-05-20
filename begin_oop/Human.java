package begin_oop;

import java.time.LocalDate;

public class Human {

    // State
    private String givenName;
    private String surName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private char sex;
    private double weight;
    private double height;

    // Constructor
    public Human(String givenName, String surName, String patronymic, LocalDate dateOfBirth, char sex, double weight, double height) {
        this.givenName = givenName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    // Getters and setters
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate date) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // Behavior
    public void goToShop() {
        System.out.println("Going for shopping...");
    }

    public void buyMilk() {
        System.out.println("Buying milk..");
    }

    public void buyBread() {
        System.out.println("Buying bread...");
    }

    public void backToHome() {
        System.out.println("Back to the house");
    }

    // Overriding method
    @Override
    public String toString() {
        return "Human{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date=" + dateOfBirth +
                ", sex=" + sex +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
