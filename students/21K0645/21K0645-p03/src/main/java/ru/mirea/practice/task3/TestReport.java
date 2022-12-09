package ru.mirea.practice.task3;

/* Разработать класс Отчет о сотрудниках
1) Создать класс Employee, у которого есть переменные класса -
fullname, salary.
2) Создать массив, содержащий несколько объектов этого типа.
3) Создать класс Report со статическим методом generateReport,
в котором выводится информация о зарплате всех сотрудников.
4) Используйте форматирование строк. Пусть salary будет
выровнено по правому краю, десятичное значение имеет 2 знака после
запятой и можете добавить что-нибудь свое. */

import java.util.ArrayList;
import java.util.List;

public final class TestReport {

    private TestReport() {
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Full Name 1", 12345.67);
        Employee employee2 = new Employee("Full Name 2", 98765.43);
        Employee employee3 = new Employee("Full Name 3", 99999.99);

        List<Employee> employees = new ArrayList<>(List.of(employee1, employee2, employee3));

        System.out.println(Report.generateReport(employees));

    }
}
