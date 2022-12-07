package ru.mirea.practice.program2;

import java.util.Comparator;

public class SortingStudentBygpa implements Comparator<SortingStudentBygpa> {
    int mark;
    int id;

    public SortingStudentBygpa(int mark, int id) {
        this.mark = mark;
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compare(SortingStudentBygpa o1, SortingStudentBygpa o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 0;
        }
        return -1;
    }
}