package ru.mirea.practice.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double profit;

    public Employer(String firstName, String lastName, double profit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profit = profit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public double getProfit() {
        return profit;
    }
}