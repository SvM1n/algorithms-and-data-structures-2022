package ru.mirea.practice.task2;

public class Student {
    private final String name;
    private final int gpa;
    private final int idNumber;

    public Student(String name, int gpa, int idNumber) {
        this.name = name;
        this.gpa = gpa;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + ", idNumber=" + idNumber + '}';
    }
}
