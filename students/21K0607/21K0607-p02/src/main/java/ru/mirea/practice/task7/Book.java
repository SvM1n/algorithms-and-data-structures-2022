package ru.mirea.practice.task7;

public class Book {
    private String author;
    private String title;
    private int data;

    public Book(String author, String title, int data) {
        this.author = author;
        this.data = data;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: author - " + author + ", title - " + title + ", Data - " + data;
    }
}
