package ru.mirea.practice.solutiontask3;

import ru.mirea.practice.solutiontask1.Student;

public final class MergeSort {
    private MergeSort() {}

    public static void mergeSort(Student[] student) {
        if (student.length < 2) {
            return;
        }
        int mid = student.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[student.length - mid];

        System.arraycopy(student, 0, left, 0, mid);
        if (student.length - mid >= 0) {
            System.arraycopy(student, mid, right, 0, student.length - mid);
        }
        mergeSort(left);
        mergeSort(right);

        merge(student, left, right, mid, student.length - mid);
    }

    public static void merge(Student[] students, Student[] l, Student[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                students[k++] = l[i++];
            } else {
                students[k++] = r[j++];
            }
        }
        while (i < left) {
            students[k++] = l[i++];
        }
        while (j < right) {
            students[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Petron", 123),
                              new Student("Alaev", 119),
                              new Student("Bashirov", 150)};
        for (Student student: students) {
            System.out.println(student);
        }
        mergeSort(students);
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
