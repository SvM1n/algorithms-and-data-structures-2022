package ru.mirea.practice.formation.task3;

abstract class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[3];
        Employee employee1 = new Employee("Gustavo Fring", 3200.765);
        Employee employee2 = new Employee("Jessie Pinkman", 45950.760);
        Employee employee3 = new Employee("Walter White", 67890.561);
        array[1] = employee1;
        array[2] = employee2;
        array[3] = employee3;

        Report.generateReport(array);
    }
}
