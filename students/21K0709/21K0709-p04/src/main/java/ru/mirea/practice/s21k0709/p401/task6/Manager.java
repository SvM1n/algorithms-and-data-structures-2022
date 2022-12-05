package ru.mirea.practice.s21k0709.p401.task6;

public class Manager extends Employer {
    String firstName;
    String lastName;
    double averageSum;

    Manager(String firstName, String lastName, int income,double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income + averageSum;
    }
}
