package ru.mirea.practice.s21k0627.task6to9;

public class Book implements Printable {
    private String name;
    private String author;
    private int publishYear;

    public Book(String name, String author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return publishYear;
    }

    public void setReleaseDate(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='" + name + '\''
                + ", author='" + author + '\''
                + ", publishYear=" + publishYear + '}';
    }
}
