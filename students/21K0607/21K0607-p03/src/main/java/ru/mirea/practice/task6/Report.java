package ru.mirea.practice.task6;

public abstract class Report {
    public static void generateReport(Employee[] array) {
        for (Employee employee : array) {
            System.out.format("%50s %-1.2f %n", employee.getFullName(), employee.getSalary());
        }
    }


}
