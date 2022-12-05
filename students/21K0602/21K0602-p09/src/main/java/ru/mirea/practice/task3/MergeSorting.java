package ru.mirea.practice.task3;

import ru.mirea.practice.task1.Student;


public abstract class MergeSorting {
    public static void mergeSort(Student[] students, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = students[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = students[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(students, left, right, mid, length - mid);
    }

    public static void merge(Student[] students, Student[] left, Student[] right, int leftI, int rightI) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftI && j < rightI) {
            if (compare(left[i], right[j]) <= 0) {
                students[k++] = left[i++];
            } else {
                students[k++] = right[j++];
            }
        }
        while (i < leftI) {
            students[k++] = left[i++];
        }
        while (j < rightI) {
            students[k++] = right[j++];
        }
    }


    private static int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
