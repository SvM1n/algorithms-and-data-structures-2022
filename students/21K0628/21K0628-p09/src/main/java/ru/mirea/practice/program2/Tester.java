package ru.mirea.practice.program2;

import java.util.ArrayList;
import java.util.List;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        List<SortingStudentBygpa> student = new ArrayList();
        student.add(new SortingStudentBygpa(50, 123));
        student.add(new SortingStudentBygpa(94, 456));
        student.add(new SortingStudentBygpa(21, 789));
        student.add(new SortingStudentBygpa(32, 122));
        student.sort(new SortingStudentBygpa(1, 1));
        for (SortingStudentBygpa s1 : student) {
            System.out.println(s1.getMark());
        }
    }
}
