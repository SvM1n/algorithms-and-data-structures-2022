package ru.mirea.worktwentyeight.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Original HashSet: " + set);
        TreeSet<String> list = new TreeSet<>(set);

        System.out.println(list);


    }
}
