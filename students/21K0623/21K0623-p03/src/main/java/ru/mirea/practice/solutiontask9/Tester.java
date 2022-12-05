package ru.mirea.practice.solutiontask9;

import static ru.mirea.practice.solutiontask9.Report.generateReport;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Employee workerfirst = new Employee("Vasilev", 123000);
        Employee workersecond = new Employee("Ivanov", 40000);
        Employee workerthird = new Employee("Bushakur", 1500);

        Employee[] worker = {workerfirst, workersecond, workerthird};
        generateReport(worker);
    }
}
