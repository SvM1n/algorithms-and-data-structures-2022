package ru.mirea.practice.task7and8;

public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название: " + name + ", автор: " + author);
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] iter) {
        for (Printable printable : iter) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}