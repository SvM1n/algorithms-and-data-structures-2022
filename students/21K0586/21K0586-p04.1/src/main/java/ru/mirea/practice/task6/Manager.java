package ru.mirea.practice.task6;

public class Manager extends Employer {
    private final int averageSum;

    public Manager(String firstName, String lastName, int income, int averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public int getIncome() {
        return super.getIncome() + averageSum;
    }
}
