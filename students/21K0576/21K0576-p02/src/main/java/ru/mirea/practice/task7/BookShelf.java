package ru.mirea.practice.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    public void addBook(Book book) {
        books.add(book);
        booksAmount = books.size();
    }

    public Book getEarliest() {
        if (booksAmount < 1) {
            return null;
        }

        int yearMin = books.get(0).getYear();
        int idx = 0;
        for (int i = 1; i < booksAmount; ++i) {
            if (yearMin > books.get(i).year) {
                yearMin = books.get(i).year;
                idx = i;
            }
        }
        return books.get(idx);
    }

    public Book getLatest() {
        if (booksAmount < 1) {
            return null;
        }

        int yearMax = books.get(0).getYear();
        int idx = 0;
        for (int i = 1; i < booksAmount; ++i) {
            if (yearMax < books.get(i).year) {
                yearMax = books.get(i).year;
                idx = i;
            }
        }
        return books.get(idx);
    }

    public void sortAscending() {
        Collections.sort(books, (a, b) -> a.year < b.year ? -1 : 0);
    }

    @Override
    public String toString() {
        String r = "";

        for (int i = 0; i < booksAmount; ++i) {
            r += books.get(i) + (i < booksAmount - 1 ? "\n\t" : "\n");
        }

        return "BookShelf{"
                + "books=\n\t" + r
                + ", booksAmount=" + booksAmount
                + '}';
    }

    List<Book> books = new ArrayList<>();
    int booksAmount = 0;
}
