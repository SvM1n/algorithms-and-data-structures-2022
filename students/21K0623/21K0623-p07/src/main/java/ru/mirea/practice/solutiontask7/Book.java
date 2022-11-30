package ru.mirea.practice.solutiontask7;

public class Book implements Printable {
    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBook(Printable[] printable) {
        for (Printable value : printable) {
            System.out.println(value instanceof Book);
        }
    }

    @Override
    public void print() {
        System.out.println("Книга " + name + ", автор " + author);
    }
}
