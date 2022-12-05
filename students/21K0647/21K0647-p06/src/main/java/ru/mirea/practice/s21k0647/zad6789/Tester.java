package ru.mirea.practice.s21k0647.zad6789;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Structure of reality", "David Deutsch");
        printables[1] = new Shop("Bazaar", "07.10.2022");
        for (Printable x: printables) {
            x.print();
        }

    }
}
