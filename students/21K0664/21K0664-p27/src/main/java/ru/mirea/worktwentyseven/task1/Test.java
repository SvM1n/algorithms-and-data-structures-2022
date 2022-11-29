package ru.mirea.worktwentyseven.task1;

public abstract class Test {

    public static void main(String[] args) {
        HashTab<String, String> a = new HashTab<>(10);

        a.hashtabAdd("one", "a");
        a.hashtabAdd("two", "b");
        a.hashtabAdd("three", "c");
        a.hashtabAdd("four", "d");
        a.hashtabAdd("five", "e");
        a.hashtabAdd("six", "f");
        a.hashtabAdd("seven", "g");
        a.hashtabAdd("eight", "h");
        a.hashtabAdd("nine", "i");
        a.hashtabAdd("ten", "j");

        a.printHash();

        a.hashtabDelete("five");
    }
}




