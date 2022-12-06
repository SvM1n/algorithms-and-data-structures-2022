package ru.mirea.practice.task6;

public abstract class Test {
    public static void main(String[] args) {
        Employer[] test = {new Employer("Иван", "Иванов", 25000),
            new Manager("Петя", "Петькин", 30000, 5000)};
        System.out.println("Employer: " + test[0].getIncome());
        System.out.println("Manager: " + test[1].getIncome());
    }
}
