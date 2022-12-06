package ru.mirea.practice.s21k0709.task3;

public abstract class MergeSort {
    public static void mergeSort(Student[] students, int length) {
        if (length < 2) {
            return;
        }
        int divide = length / 2;
        Student[] left = new Student[divide];
        Student[] right = new Student[length - divide];

        for (int i = 0; i < divide; i++) {
            left[i] = students[i];
        }
        for (int i = divide; i < length; i++) {
            right[i - divide] = students[i];
        }
        mergeSort(left, divide);
        mergeSort(right, length - divide);

        merge(students, left, right, divide, length - divide);
    }

    public static void merge(Student[] students, Student[] left, Student[] right, int leftI, int rightI) {

        int i = 0;
        int j = 0;
        int ind = 0;
        while (i < leftI && j < rightI) {
            if (compare(left[i], right[j]) <= 0) {
                students[ind++] = left[i++];
            } else {
                students[ind++] = right[j++];
            }
        }
        while (i < leftI) {
            students[ind++] = left[i++];
        }
        while (j < rightI) {
            students[ind++] = right[j++];
        }
    }


    private static int compare(Student obj1, Student obj2) {
        return obj1.getMark() - obj2.getMark();
    }
}

