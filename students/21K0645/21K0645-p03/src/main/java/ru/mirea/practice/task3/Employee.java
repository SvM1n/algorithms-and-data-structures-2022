package ru.mirea.practice.task3;

/* Создать класс Employee, у которого есть переменные класса -
fullname, salary.
 */

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "fullname='" + fullname + '\''
                + ",  salary=" + salary
                + '}';
    }
}
