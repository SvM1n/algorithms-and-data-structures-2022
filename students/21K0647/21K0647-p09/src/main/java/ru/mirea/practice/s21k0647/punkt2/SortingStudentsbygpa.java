package ru.mirea.practice.s21k0647.punkt2;


import ru.mirea.practice.s21k0647.punkt1.Student;

import java.util.Comparator;

public class SortingStudentsbygpa implements Comparator<Student> {
    Student []studentss;

    SortingStudentsbygpa(int n) {
        studentss = new Student[n];
    }

    public void qsort(Student []students, int l, int r) {
        if (l >= r) {
            return;
        }
        int pi = partition(students, l, r);
        qsort(students, l, pi - 1);
        qsort(students, pi + 1, r);


    }

    public int partition(Student []students, int l, int r) {
        Student pivot = students[r];
        int ptr = l - 1;
        for (int i = l; i < r; i++) {
            if (compare(students[i], pivot) > 0) {
                ptr++;
                swap(ptr, i, students);
            }
        }
        swap(ptr + 1, r, students);
        return ptr + 1;
    }

    private void swap(int ptr, int i, Student[] students) {
        Student temp = students[ptr];
        students[ptr] = students[i];
        students[i] = temp;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGba() - o2.getGba();
    }

    public static void main(String[] args) {
        Student []students = new Student[5];
        students[0] = new Student(5234, "Ivanov Ivan", 97);
        students[1] = new Student(7152, "Smirnov Ivan", 13);
        students[2] = new Student(6412, "Petrov Ivan", 32);
        students[3] = new Student(3125, "Markov Ivan", 55);
        students[4] = new Student(9432, "Antonow Ivan", 19);
        SortingStudentsbygpa ss = new SortingStudentsbygpa(5);
        ss.qsort(students, 0, students.length - 1);
        for (Student x: students) {
            System.out.println(x);
        }
    }
}
