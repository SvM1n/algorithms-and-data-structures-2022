package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa(new SortingStudentsByGpa[]{new SortingStudentsByGpa(4.2),
            new SortingStudentsByGpa(3.1),
            new SortingStudentsByGpa(4.5),
            new SortingStudentsByGpa(3.2),
            new SortingStudentsByGpa(4.8),
            new SortingStudentsByGpa(3.6)});

        sortingStudentsByGpa.print();
        sortingStudentsByGpa.quickSort(sortingStudentsByGpa.getSource(),0, sortingStudentsByGpa.getSource().length - 1);
        sortingStudentsByGpa.print();
    }
}
