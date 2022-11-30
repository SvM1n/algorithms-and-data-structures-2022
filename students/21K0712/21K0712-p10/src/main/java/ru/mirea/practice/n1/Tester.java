package ru.mirea.practice.n1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class Tester implements Comparator<Student> {
    public static int n;
    public static List<Student> idnumber = new ArrayList<>(n);

    public static void quicksort(List<Student> array, int low, int high) {
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Student opora = array.get(middle);

        int i = low;
        int j = high;
        while (i <= j) {
            while (compar(array.get(i), opora) == 1) {
                i++;
            }

            while (compar(array.get(i), opora) == -1) {
                j--;
            }

            if (i <= j) {
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(array, low, j);
        }

        if (high > i) {
            quicksort(array, i, high);
        }
    }

    public static void outArray() {
        for (Student i : idnumber) {
            System.out.println(i.toString());
        }
    }


    public static int compar(Student o1, Student o2) {
        if (o1.equals(o2)) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }
}

