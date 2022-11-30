package ru.mirea.practice.solutiontask5;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        ProcessStrings first = new ProcessStrings("Потоп");
        System.out.println(first.lenString());
        System.out.println(first.invert());
        System.out.println(first.oddString());
    }
}
