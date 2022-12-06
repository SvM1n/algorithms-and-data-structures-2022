package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

public final class TestReport {

    private TestReport(){
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Full Name 1", 12345.67);
        Employee employee2 = new Employee("Full Name 2", 98765.43);
        Employee employee3 = new Employee("Full Name 3", 99999.99);

        List<Employee> employees = new ArrayList<>(List.of(employee1, employee2, employee3));

        System.out.println(Report.generateReport(employees));

    }
}
