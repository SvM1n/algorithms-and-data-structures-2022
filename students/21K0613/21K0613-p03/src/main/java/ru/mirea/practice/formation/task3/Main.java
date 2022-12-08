package ru.mirea.practice.formation.task3;

import java.util.ArrayList;

abstract class Main {
    public static void main(String[] args){
        ArrayList<Employee> array = new ArrayList<>();
        Employee employee1 = new Employee("Gustavo Fring", 3200.765);
        Employee employee2 = new Employee("Jessie Pinkman", 45950.760);
        Employee employee3 = new Employee("Walter White", 67890.561);
        array.add(employee1);
        array.add(employee2);
        array.add(employee3);

        Report.generateReport(array);
    }
}
