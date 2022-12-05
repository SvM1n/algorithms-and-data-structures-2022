package ru.mirea.practice.n2;


import java.util.ArrayList;


abstract class Main {
    public static void main(String[] args) {
        ArrayList<SortingStudentsbygpa> list = new ArrayList<SortingStudentsbygpa>();
        list.add(new SortingStudentsbygpa(100));
        list.add(new SortingStudentsbygpa(23));
        list.add(new SortingStudentsbygpa(32));
        list.add(new SortingStudentsbygpa(14));
        list.add(new SortingStudentsbygpa(11));

        list.sort(new SortingStudentsbygpa(1));

        for (SortingStudentsbygpa sortingStudentsbygpa : list) {
            System.out.println(sortingStudentsbygpa.getMark());
        }
    }
}
