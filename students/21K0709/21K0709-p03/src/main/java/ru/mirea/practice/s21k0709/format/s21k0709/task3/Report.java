package ru.mirea.practice.s21k0709.format.s21k0709.task3;

import java.util.Formatter;

public class Report {
    Employer a;

    public Report(Employer a) {
        this.a = a;
    }

    public Formatter generateReport() {
        try (Formatter formatter = new Formatter()) {
            return formatter.format("|%15s %15s| \n|%15s %15.2f|", "Name", a.fullname, "Salary", a.salary);
        }
    }
}