package ru.mirea.practice.task7;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> bookshelf = new ArrayList<Book>();
    private Book book;

    public void addBook(Book book) {
        bookshelf.add(book);
    }

    public void young() {
        int max = 0;
        for (Book value : bookshelf) {
            if (value.getWriteYear() > max) {
                max = value.getWriteYear();
            }
        }
        System.out.println(max);
    }

    public void old() {
        int min = bookshelf.get(0).getWriteYear();
        for (Book value : bookshelf) {
            if (value.getWriteYear() <= min) {
                min = value.getWriteYear();
            }
        }
        System.out.println(min);
    }

    public Bookshelf() {
        for (int i = 0; i < bookshelf.size(); i++) {
            bookshelf.add(i, book);
        }
    }

    public void sort() {
        int tmp;
        int a;
        int b;
        for (int i = 0; i < bookshelf.size() - 1; ) {
            for (int j = 1; j < bookshelf.size(); ) {
                if (bookshelf.get(i).getWriteYear() > bookshelf.get(j).getWriteYear()) {
                    a = bookshelf.get(i).getWriteYear();
                    b = bookshelf.get(j).getWriteYear();
                    tmp = a;
                    a = b;
                    b = tmp;

                }
                j++;
            }
            i++;
        }
    }

    public void print() {
        System.out.print(bookshelf.toString());
    }


}

