package ru.mirea.practice.tasks6to9;

public class Book implements Printable {
    private String name;
    private String author;

    @Override
    public void print() {
        System.out.println("Название: " + name + ", автор: " + author);
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}