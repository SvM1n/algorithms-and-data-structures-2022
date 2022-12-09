package ru.mirea.practice.task2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<SortingStudentsByGpa> {
    private double gg;
    private SortingStudentsByGpa[] studentsByGpas;

    public SortingStudentsByGpa(SortingStudentsByGpa[] source) {
        this.studentsByGpas = source;
    }

    public SortingStudentsByGpa(double gpa) {
        this.gg = gg;
    }

    public double getGg() {
        return gg;
    }

    public void setGg(double gg) {
        this.gg = gg;
    }

    public SortingStudentsByGpa[] getSource() {
        return studentsByGpas;
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
                    double tmp = source[leftMarker].getGg();
                    source[leftMarker].setGg(source[rightMarker].getGg());
                    source[rightMarker].setGg(tmp);
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
        for (SortingStudentsByGpa sortingStudentsByGpa : studentsByGpas) {
            System.out.print(sortingStudentsByGpa.getGg() + " ");
        }
        System.out.println();
    }

    @Override
    public int compare(SortingStudentsByGpa o1, SortingStudentsByGpa o2) {
        if (o1.getGg() == o2.getGg()) {
            return 0;
        }
        if (o1.getGg() > o2.getGg()) {
            return 1;
        }
        return -1;
    }
}
