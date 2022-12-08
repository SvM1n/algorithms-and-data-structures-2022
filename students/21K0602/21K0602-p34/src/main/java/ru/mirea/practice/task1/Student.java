package ru.mirea.practice.task1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return gpa == student.gpa && idNumber == student.idNumber && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa, idNumber);
    }
}
