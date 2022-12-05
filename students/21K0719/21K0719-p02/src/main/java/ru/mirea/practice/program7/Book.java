package ru.mirea.practice.program7;

public class Book {
    private String name;
    private int date;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{"
                +
                "name='"
                +
                name
                +
                '\''
                +
                ", date="
                +
                date
                +
                ", author='"
                +
                author
                +
                '\''
                +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
