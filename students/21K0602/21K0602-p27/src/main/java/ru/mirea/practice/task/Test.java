package ru.mirea.practice.task;



public abstract class Test {
    public static void main(String[] args) {
        HashTab<Integer, String> tab = new HashTab<>();
        tab.hashAdd(1,"one");
        tab.hashAdd(2,"two");
        tab.hashAdd(3,"three");
        tab.hashAdd(4,"four");
        tab.hashAdd(5,"five");
        tab.hashAdd(6,"six");
        tab.hashAdd(7,"seven");
        tab.hashAdd(8,"eight");
        tab.hashAdd(9,"nine");
        tab.hashAdd(10,"ten");
        tab.hashAdd(3,"three");
        tab.hashLookup();
        System.out.println(tab.hashtableHash(3));
        tab.hashDelete(9);
        tab.hashLookup();

    }
}
