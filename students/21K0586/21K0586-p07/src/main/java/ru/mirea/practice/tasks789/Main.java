package ru.mirea.practice.tasks789;

public abstract class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[2];
        printable[1] = new Book("Book");
        printable[0] = new Magazine("Magazine");
        Book.printBooks(printable);

    }
}