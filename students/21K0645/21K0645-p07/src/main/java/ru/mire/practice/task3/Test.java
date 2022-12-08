package ru.mire.practice.task3;

public abstract class Test {
    public static void main(String[] args) {

        Processable processString = new ProcessString("Hello World!");

        System.out.println(processString.length());
        System.out.println(processString.reverse());
        System.out.println(processString.oddCharacters());

    }
}
