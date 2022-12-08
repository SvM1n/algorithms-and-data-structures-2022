package ru.mirea.practice.task3;

public class Student {
    private final double gpa;
    private final int idNumber;

    public Student(double gpa, int idNumber) {
        this.gpa = gpa;
        this.idNumber = idNumber;
    }


    public double getGpa() {
        return gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{"
                + "gpa=" + gpa
                + ", idNumber=" + idNumber
                + '}';
    }
}
