package ru.mirea.practice.task3;

public class Student {
    private final double aDouble;
    private final int idnumber;

    public Student(double gpa, int idNumber) {
        this.aDouble = gpa;
        this.idnumber = idNumber;
    }


    public double getaDouble() {
        return aDouble;
    }

    public int getIdnumber() {
        return idnumber;
    }

    @Override
    public String toString() {
        return "Student{"
                + "gpa=" + aDouble
                + ", idNumber=" + idnumber
                + '}';
    }
}
