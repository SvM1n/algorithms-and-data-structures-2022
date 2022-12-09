package mirea.practice.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(34);
        hashSet.add(43);
        hashSet.add(56);
        hashSet.add(65);
        hashSet.add(34);

        System.out.println(hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println(treeSet);
    }
}
