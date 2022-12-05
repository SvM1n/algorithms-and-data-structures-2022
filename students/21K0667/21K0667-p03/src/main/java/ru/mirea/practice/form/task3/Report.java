package ru.mirea.practice.form.task3;

abstract class Report {
    public static void generateReport(Employee[] arr) {
        for (Employee employee : arr) {
            System.out.printf("%16s %.2f %n", employee.getFullName(), employee.getSalary());
        }

    }
}

