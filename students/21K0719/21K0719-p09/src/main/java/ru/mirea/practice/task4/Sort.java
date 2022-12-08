package ru.mirea.practice.task4;

import ru.mirea.practice.task3.Student;

public class Sort implements Comparable {
    private Student[] arr;

    public Sort(Student[] arr) {
        this.arr = arr;
    }

    public Student[] getArr() {
        return arr;
    }

    @Override
    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].getGpa() < arr[j].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
