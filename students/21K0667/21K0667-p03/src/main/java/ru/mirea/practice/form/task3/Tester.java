package ru.mirea.practice.form.task3;

abstract class Tester {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Иванов Иван Иванович", 40009.55555);
        arr[1] = new Employee("Петров Петр Петрович", 50009.55555);
        arr[2] = new Employee("Иванов Глеб Денисови", 60009.55555);

        Report.generateReport(arr);
    }
}

