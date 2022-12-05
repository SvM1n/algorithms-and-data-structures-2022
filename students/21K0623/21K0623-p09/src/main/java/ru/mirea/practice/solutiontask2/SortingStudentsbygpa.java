package ru.mirea.practice.solutiontask2;

public class SortingStudentsbygpa implements Comparable<SortingStudentsbygpa> {
    private final double gpa;

    public SortingStudentsbygpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return gpa + "\n";
    }

    @Override
    public int compareTo(SortingStudentsbygpa o) {
        if (this.gpa - o.gpa >= 0) {
            return 1;
        }
        return 0;
    }
}
