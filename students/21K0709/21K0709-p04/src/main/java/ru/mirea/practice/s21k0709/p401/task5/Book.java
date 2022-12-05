package ru.mirea.practice.s21k0709.p401.task5;

public class Book {
    String nameBook;
    String authorBook;

    Book(String nameBook, String authorBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }

    Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }
}
