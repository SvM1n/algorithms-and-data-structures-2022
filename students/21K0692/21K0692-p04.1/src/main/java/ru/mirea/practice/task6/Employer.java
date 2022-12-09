package ru.mirea.practice.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public double getIncome() {
        return income;
    }
}
