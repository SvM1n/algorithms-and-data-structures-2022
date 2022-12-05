package ru.mirea.practice.solutiontask1;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    public void mergeSort(Student[] student) {
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

    public void merge(Student[] students, Student[] l, Student[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (compare(l[i], r[j]) <= 0) {
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

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
