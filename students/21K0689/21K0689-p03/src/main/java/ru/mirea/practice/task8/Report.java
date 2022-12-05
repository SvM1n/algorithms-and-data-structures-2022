package ru.mirea.practice.task8;

import java.util.ArrayList;
import java.util.List;

public class Report {
    public List<Employee> employeeList = new ArrayList<>();

    public static void generateReport(List<Employee> array) {
        for (Employee employee : array) {
            System.out.format("Имя сотрудника %s, Зарплата: %20.2f", employee.getFullname(), employee.getSalary());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Report report = new Report();
        report.employeeList.add(new Employee("Steven", 200));
        report.employeeList.add(new Employee("James", 250.5));
        report.employeeList.add(new Employee("John", 300));
        report.employeeList.add(new Employee("Thom", 400));
        report.employeeList.add(new Employee("Kirk", 600));
        report.employeeList.add(new Employee("Adam", 800.800));
        generateReport(report.employeeList);
    }
}
