package ru.mirea.practice.n3;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static List<Merge> mergeSort(List<Merge> newList) {
        if (newList == null) {
            return newList;
        }
        if (newList.size() < 2) {
            return newList;
        }

        List<Merge> left = new ArrayList<>(newList.size() / 2);
        List<Merge> right = new ArrayList<>(newList.size() - newList.size() / 2);

        for (int i = 0; i < newList.size() / 2; i++) {
            left.add(i, newList.get(i));
        }

        for (int i = newList.size() / 2; i < newList.size(); i++) {
            int j = i - newList.size() / 2;
            right.add(j, newList.get(i));
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).getMark() > right.get(j).getMark()) {
                    Merge buff = new Merge(left.get(i).getMark());
                    left.set(i, right.get(j));
                    right.set(j, buff);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.size(); i++) {
            newList.set(i, left.get(i));
            k++;
        }
        for (int i = k; i < newList.size(); i++) {
            int j = i - k;
            newList.set(i, right.get(j));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Merge> list1 = new ArrayList<>(3);
        list1.add(new Merge(27));
        list1.add(new Merge(132));
        list1.add(new Merge(1));

        List<Merge> list2 = new ArrayList<>(3);
        list2.add(new Merge(100));
        list2.add(new Merge(23));
        list2.add(new Merge(11));
    }
}
