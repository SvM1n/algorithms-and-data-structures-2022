package ru.mirea.practice.s21k0627.p41.task5;

public class Book {
    String nameOfBook;
    String authorOfBook;

    Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
}
