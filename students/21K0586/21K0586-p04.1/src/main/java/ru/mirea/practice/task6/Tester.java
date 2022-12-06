package ru.mirea.practice.task6;

public abstract class Tester {
    public static void main(String[] args) {
        Employer[] employers = {new Employer("Ivan", "Ivanov", 40000),
            new Employer("Andrei", "Sidorov", 44000),
            new Manager("Petr", "Petrov", 50000, 12000)};

        for (Employer employer : employers) {
            System.out.println(employer.getIncome());
        }
    }
}
