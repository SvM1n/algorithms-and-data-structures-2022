package ru.mirea.practice.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(324);
        set.add(12);
        set.add(976);
        set.add(45);
        set.add(2);
        set.add(978);
        set.add(24);
        Set<Integer> treeSet = new TreeSet<>(set);

        System.out.println("hash set " + set);
        System.out.println("tree set " + treeSet);
    }
}
