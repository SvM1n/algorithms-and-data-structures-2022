package ru.mirea.practice.task7.s21k0627;

import java.util.List;
import java.util.ArrayList;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    private int amountOfBooks;

    public BookShelf(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    public BookShelf() {
        //
    }

    public Book newestBook(BookShelf obj) {
        int max = 0;
        Book newb = new Book();
        for (Book i : obj.getBooks()) {
            if (i.getYear() > max) {
                max = i.getYear();
                newb = i;
            }
        }
        System.out.print("Самый поздний срок издания у книги: ");
        return newb;
    }

    public Book oldestBook(BookShelf obj) {
        int min = 1000000;
        Book oldb = new Book();
        for (Book i : obj.getBooks()) {
            if (i.getYear() < min) {
                min = i.getYear();
                oldb = i;
            }
        }
        System.out.print("Самый ранний срок издания у книги: ");
        return oldb;
    }

    public BookShelf sort(BookShelf obj, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = i; j < amount - i - 1; j++) {
                if (obj.getBooks().get(j).getYear() > obj.getBooks().get(j + 1).getYear()) {
                    Book k = obj.getBooks().get(j);
                    obj.getBooks().add(k);
                    obj.getBooks().set(j, obj.getBooks().get(j + 1));
                    obj.getBooks().set(j + 1, obj.getBooks().get(books.indexOf(k)));
                    obj.getBooks().remove(k);
                }
            }
        }
        return obj;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

}

