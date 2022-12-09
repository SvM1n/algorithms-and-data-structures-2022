package ru.mirea.practice.task6;

public abstract class Tester {
    public static void main(String[] args) {
        Employer[] arr = {new Employer("Арсюша", "Худякоу", 20000),
            new Manager("Арсюша2", "Худякоу2", 15000, 7000)};

        System.out.print("Employer: " + arr[0].getIncome() + "\n");
        System.out.print("Manager: " + arr[1].getIncome() + "\n");
    }
}
