package ru.mirea.practice.s21k0647.punkt3;

import ru.mirea.practice.s21k0647.punkt1.Student;


public final class Tester {
    private Tester() {

    }

    public static void mergeSort(Student[]students) {
        int n = students.length;
        if (n == 1) {
            return;
        }
        int mid  = n / 2;
        Student []l = new Student[mid];
        Student []r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = students[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = students[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(students, l, r);
    }

    private static void merge(Student[] students, Student[] l, Student[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (compare(l[i], r[j]) < 0) {
                students[idx] = l[i];
                i++;
                idx++;

            } else {
                students[idx] = r[j];
                j++;
                idx++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            students[idx++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            students[idx++] = r[rr];
        }
    }

    public static void main(String []args) {
        Student []students = new Student[5];
        students[0] = new Student(5234, "Ivanov Ivan", 97);
        students[1] = new Student(7152, "Smirnov Ivan", 13);
        students[2] = new Student(6412, "Petrov Ivan", 32);
        students[3] = new Student(3125, "Markov Ivan", 55);
        students[4] = new Student(9432, "Antonow Ivan", 19);
        mergeSort(students);
        for (Student x: students) {
            System.out.println(x);
        }
    }


    public static int compare(Student o1, Student o2) {
        return o1.getGba() - o2.getGba();
    }
}
