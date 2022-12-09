package ru.mirea.practice.task3;

/* Создать класс Report со статическим методом generateReport,
в котором выводится информация о зарплате всех сотрудников.
Используйте форматирование строк. Пусть salary будет выровнено
по правому краю, десятичное значение имеет 2 знака после запятой . */

import java.util.Formatter;
import java.util.List;

public final class Report {

    private Report() {
    }

    public static String generateReport(List<Employee> employees) {

        try (Formatter formatter = new Formatter()) {

            for (Employee employee : employees) {
                formatter.format("%s : %.2f %n", employee.getFullname(), employee.getSalary());
            }

            return formatter.toString();
        }
    }
}
