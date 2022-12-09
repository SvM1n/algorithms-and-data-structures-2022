package ru.mirea.practice.task6;

public abstract class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Sasha", 15000);
        empArray[1] = new Employee("Petr", 20000);
        empArray[2] = new Employee("Masha", 18000);
        empArray[3] = new Employee("Stepan", 100000);
        empArray[4] = new Employee("Alex", 50000);
        Report.generateReport(empArray);

    }
}
