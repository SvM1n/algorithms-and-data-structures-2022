package ru.mirea.practice.s21k0709.format.s21k0709.task3;

public class Employer {
    String fullname;
    float salary;

    Employer(String fullname, float salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
