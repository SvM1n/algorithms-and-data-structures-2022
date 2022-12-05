package ru.mirea.practice.task4;

import ru.mirea.practice.task1.Student;

import java.util.Arrays;

public class Sorting implements Comparable {
    private Student[] students;
    private int length;


    public Sorting(Student[] students, int length) {
        this.students = students;
        this.length = length;
    }

    public Sorting(int length) {
        this.length = length;
        students = new Student[length];
    }

    public void setStudent(Student student, int index) {
        if (index < length) {
            students[index] = student;
        }
    }

    @Override
    public String toString() {
        return "Sorting{" + "students=" + Arrays.toString(students) + '}';
    }

    @Override
    public void sort() {
        //bubble sort

        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                if (students[i].getGpa() > students[j].getGpa()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

    }
}
