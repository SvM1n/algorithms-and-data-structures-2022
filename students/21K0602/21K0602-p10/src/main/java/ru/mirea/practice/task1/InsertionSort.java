package ru.mirea.practice.task1;

import java.util.Arrays;

public class InsertionSort {

    private Student[] students;
    private int length;


    public InsertionSort(int length) {
        this.length = length;
        students = new Student[length];
    }

    public Student[] getStudents() {
        return students;
    }


    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insertionSort() {
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(students));
        for (int left = 0; left < length; left++) {
            Student student = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (student.getIdNumber() < students[i].getIdNumber()) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = student;
        }
        System.out.println("After sorting");
        System.out.println(Arrays.toString(students));

    }
}
