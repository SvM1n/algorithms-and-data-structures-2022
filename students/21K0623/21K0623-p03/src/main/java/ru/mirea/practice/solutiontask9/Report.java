package ru.mirea.practice.solutiontask9;

public final class Report {
    private Report() {}

    public static void generateReport(Employee[] worker) {
        for (Employee employee : worker) {
            System.out.printf("Фамилия рабочего: %s %n", employee.getFullname());
            System.out.printf("%15s %10.2f %n", "Зарплата:", employee.getSalary());
        }
    }
}