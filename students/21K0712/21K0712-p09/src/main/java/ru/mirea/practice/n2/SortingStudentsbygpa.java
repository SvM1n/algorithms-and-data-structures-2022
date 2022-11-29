package ru.mirea.practice.n2;

import java.util.Comparator;

public class SortingStudentsbygpa implements Comparator<SortingStudentsbygpa> {

    int mark;

    public int getMark() {
        return this.mark;
    }

    SortingStudentsbygpa(int mark) {
        this.mark = mark;
    }

    @Override
    public int compare(SortingStudentsbygpa o1, SortingStudentsbygpa o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }
}
