package ru.mirea.practice.task2;

public abstract class MergeSort {
    public static void mergeSort(Student[] arr, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, length - mid);
        merge(arr, l, r, mid, length - mid);
    }

    public static void merge(Student[] arr, Student[] l, Student[] r, int left1, int right1) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left1 && j < right1) {
            if (compare(l[i], r[j]) <= 0) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left1) {
            arr[k++] = l[i++];
        }
        while (j < right1) {
            arr[k++] = r[j++];
        }
    }


    public static int compare(Student o1, Student o2) {
        if (o1.getGpa() == o2.getGpa()) {
            return 0;
        }
        if (o1.getGpa() > o2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
