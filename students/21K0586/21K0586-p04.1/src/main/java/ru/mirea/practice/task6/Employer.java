package ru.mirea.practice.task6;

public class Employer {
    private final String firstName;
    private final String lastName;
    private final int income;

    public Employer(String firstName, String lastName, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
