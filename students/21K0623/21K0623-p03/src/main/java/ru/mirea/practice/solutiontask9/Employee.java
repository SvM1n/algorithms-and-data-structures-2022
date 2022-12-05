package ru.mirea.practice.solutiontask9;

public class Employee {
    private final String fullname;
    private final double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return this.fullname;
    }

    public double getSalary() {
        return this.salary;
    }

}
