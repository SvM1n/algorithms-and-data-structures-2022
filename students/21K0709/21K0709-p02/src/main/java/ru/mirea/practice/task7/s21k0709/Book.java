package ru.mirea.practice.task7.s21k0709;

public class Book {
    private String author;
    private String name;
    private int year;
    private int yearpublish;

    public Book(String name, int yearpublish) {
        this.name = name;
        this.yearpublish = yearpublish;
    }

    public Book() {
        // //
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearpublish() {
        return yearpublish;
    }

    public void setYearpublish(int yearpublish) {
        this.yearpublish = yearpublish;
    }
}
