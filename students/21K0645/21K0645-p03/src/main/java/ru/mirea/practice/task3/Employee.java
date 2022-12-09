package ru.mirea.practice.task3;

/* Создать класс Employee, у которого есть переменные класса -
fullname, salary.
 */

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(fullname, employee.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, salary);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "fullname='" + fullname + '\''
                + ",  salary=" + salary
                + '}';
    }
}
