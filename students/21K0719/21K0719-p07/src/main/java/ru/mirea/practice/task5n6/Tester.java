package ru.mirea.practice.task5n6;

public abstract class Tester {
    public static void main(String[] args) {
        StringFunc processStrings = new ProcessStrings("Genius");
        System.out.println(processStrings.length());
        System.out.println(processStrings.reverse());
        System.out.println(processStrings.deleteEvenNumber());

    }
}
