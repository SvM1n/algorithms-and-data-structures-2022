package ru.mirea.practice.task7;

public class Book {
    private String name;
    private String title;
    private int writeYear;

    public Book(String name, String title, int writeyear) {
        this.name = name;
        this.title = title;
        this.writeYear = writeyear;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWriteYear() {
        return writeYear;
    }

    @Override
    public String toString() {
        return "Book {Author: " + name + ", Title: " + title + ", Write year: " + writeYear + "}";
    }
}

