package ru.mirea.practice.task7;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> bookShelf;

    public BookShelf() {
        bookShelf = new ArrayList<Book>(0);
    }

    public void addBook(Book book) {
        bookShelf.add(book);
    }

    public void sortBooks() {
        for (int j = 0; j < bookShelf.size(); j++) {
            Book value = bookShelf.get(j);
            for (int i = 0; i < bookShelf.size(); i++) {
                if (bookShelf.get(j).getData() < bookShelf.get(i).getData()) {
                    bookShelf.set(j, bookShelf.get(i));
                    bookShelf.set(i, value);
                } else {
                    break;
                }
            }
        }
        System.out.println(bookShelf);
    }

    public Book getMaxData() {
        Book maxBook = new Book(null, null, 0);
        for (Book book : bookShelf) {
            if (book.getData() > maxBook.getData()) {
                maxBook = book;
            }
        }
        return maxBook;
    }

    public Book getMinData() {
        Book minBook = new Book(null, null, 10000);
        for (Book book : bookShelf) {
            if (book.getData() < minBook.getData()) {
                minBook = book;
            }
        }
        return minBook;
    }
}
