package ru.mirea.practice.task7.s21k0709;

import java.util.List;
import java.util.ArrayList;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    private int booksonshelf;

    public BookShelf(int booksonshelf) {
        this.booksonshelf = booksonshelf;
    }

    public BookShelf() {
        // //
    }

    public Book maxPublYear(BookShelf obj) {
        int max = 0;
        Book maxb = new Book();
        for (Book i : obj.getBooks()) {
            if (i.getYearpublish() > max) {
                max = i.getYearpublish();
                maxb = i;
            }
        }
        System.out.print("Самый поздний срок издания у книги: ");
        return maxb;
    }

    public Book minPublYear(BookShelf obj) {
        int min = 1000000;
        Book minb = new Book();
        for (Book i : obj.getBooks()) {
            if (i.getYearpublish() < min) {
                min = i.getYearpublish();
                minb = i;
            }
        }
        System.out.print("Самый ранний срок издания у книги: ");
        return minb;
    }

    public BookShelf sort(BookShelf obj, int colbooks) {
        for (int i = 0; i < colbooks; i++) {
            for (int j = i; j < colbooks - i - 1; j++) {
                if (obj.getBooks().get(j).getYearpublish() > obj.getBooks().get(j + 1).getYearpublish()) {
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

    public int getBooksonshelf() {
        return booksonshelf;
    }

    public void setBooksonshelf(int booksonshelf) {
        this.booksonshelf = booksonshelf;
    }

}
