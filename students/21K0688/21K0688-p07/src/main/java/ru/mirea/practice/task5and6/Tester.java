package ru.mirea.practice.task5and6;

public abstract class Tester {
    public static void main(String[] args) {
        StringFunc processStrings = new ProcessStrings("Арсюша Худякоу");
        System.out.println(processStrings.length());
        System.out.println(processStrings.deleteEvenNumber());
        System.out.println(processStrings.reverse());
    }
}
