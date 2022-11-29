package ru.mirea.practice.formatting.report;

abstract class Test {
    public static void main(String[] args) {
        Employee[] arr = new Employee[2];
        arr[0] = new Employee("Моисей Абрамович Проходимов", 541005.52);
        arr[1] = new Employee("Клюшкин Евгений Креберович", 875.23671);
        Report.generateReport(arr);
    }
}