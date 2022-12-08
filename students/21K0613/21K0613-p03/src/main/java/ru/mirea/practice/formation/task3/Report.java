package ru.mirea.practice.formation.task3;

abstract class Report {
    public static void generateReport(Employee[] array) {
        for (Employee iterator : array) {
            System.out.print("Зарплата сотрудника " + iterator.getFullName() + ":");
            System.out.printf("%1$15.2f %n", iterator.getSalary());
        }
    }
}
