package ru.mirea.practice.s21k0709.task6to9;

public class Book implements Printable {
    private String name;
    private String author;
    private double releaseDate;

    public Book(String name, String author, double releaseDate) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
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

    public double getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(double releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{"
                +
                "name='" + name + '\''
                +
                ", author='" + author + '\''
                +
                ", releaseDate=" + releaseDate
                +
                '}';
    }
}
