package ru.mirea.practice.program7;

import java.util.Scanner;

public class BookShelf {
    private static final int n = 4;
    private final Book[] shelf = new Book[n];

    public void init() {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                shelf[i] = new Book();
                System.out.println("Enter name : ");
                shelf[i].setName(sc.next());
                System.out.println("Enter date : ");
                shelf[i].setDate(sc.nextInt());
                System.out.println("Enter author : ");
                shelf[i].setAuthor(sc.next());
            }
        }
    }

    public Book findTheEarlier() {
        Book temp = new Book();
        temp.setDate(Integer.MAX_VALUE);
        for (Book book : shelf) {
            if (book.getDate() < temp.getDate()) {
                temp.setDate(book.getDate());
                temp.setName(book.getName());
                temp.setAuthor(book.getAuthor());
            }
        }
        return temp;
    }

    public Book findTheLatest() {
        Book temp = new Book();
        temp.setDate(Integer.MIN_VALUE);
        for (Book book : shelf) {
            if (book.getDate() > temp.getDate()) {
                temp.setDate(book.getDate());
                temp.setName(book.getName());
                temp.setAuthor(book.getAuthor());
            }
        }
        return temp;
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (shelf[j].getDate() > shelf[i].getDate()) {
                    Book temp = shelf[j];
                    shelf[j] = shelf[i];
                    shelf[i] = temp;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.println(shelf[i]);
        }
    }
}
