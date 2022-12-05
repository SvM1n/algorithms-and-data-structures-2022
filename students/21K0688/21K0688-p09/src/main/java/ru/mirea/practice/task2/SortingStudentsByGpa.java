package ru.mirea.practice.task2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<SortingStudentsByGpa> {
    private double gpa;
    private SortingStudentsByGpa[] source1;

    public SortingStudentsByGpa(SortingStudentsByGpa[] source) {
        this.source1 = source;
    }

    public SortingStudentsByGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public SortingStudentsByGpa[] getSource() {
        return source1;
    }

    public void quickSort(SortingStudentsByGpa[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        SortingStudentsByGpa pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (compare(source[leftMarker], pivot) < 0) {
                leftMarker++;
            }
            while (compare(source[rightMarker], pivot) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    double tmp = source[leftMarker].getGpa();
                    source[leftMarker].setGpa(source[rightMarker].getGpa());
                    source[rightMarker].setGpa(tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public void print() {
        for (SortingStudentsByGpa sortingStudentsByGpa : source1) {
            System.out.print(sortingStudentsByGpa.getGpa() + " ");
        }
        System.out.println();
    }

    @Override
    public int compare(SortingStudentsByGpa o1, SortingStudentsByGpa o2) {
        if (o1.getGpa() == o2.getGpa()) {
            return 0;
        }
        if (o1.getGpa() > o2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
