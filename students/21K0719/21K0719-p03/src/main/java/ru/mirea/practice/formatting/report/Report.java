package ru.mirea.practice.formatting.report;

abstract class Report {
    public static void generateReport(Employee[] arr) {
        for (Employee employee : arr) {
            System.out.printf("%40s %10.2f %n",employee.getFullName(), employee.getSalary());
        }
    }
}
