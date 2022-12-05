package ru.mirea.practice.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Bookshelf poloshka = new Bookshelf();
        poloshka.addBook(new Book("Xia", "book without name", 2000));
        poloshka.addBook(new Book("Xia", "book with name", 1920));
        poloshka.addBook(new Book("Xia", "book with name Part 2", 1921));
        poloshka.bookSort();
        System.out.print(poloshka.getOldest().toString() + "\n");
        System.out.print(poloshka.getYoungest().toString() + "\n");
        poloshka.show();
    }
}
