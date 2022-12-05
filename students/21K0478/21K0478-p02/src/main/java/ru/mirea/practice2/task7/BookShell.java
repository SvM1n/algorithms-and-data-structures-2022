package ru.mirea.practice2.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShell {
    private List<Book> shelf = new ArrayList<Book>();
    private Book[] sortArray;
    private int amountOfBooks;

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void addBook() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите количество книг,которые хотите поставить на полку");
            int n = sc.nextInt();
            amountOfBooks = n;
            sortArray = new Book[n];
            System.out.println("Введите книги которые хотите поставить на полку");
            for (int i = 0; i < n; i++) {
                String author = sc.next();
                int releaseDate = sc.nextInt();
                Book b = new Book(releaseDate, author);
                shelf.add(b);
                sortArray[i] = b;
            }
        }
    }

    public String findEarliestBook() {
        int min = shelf.get(0).getReleaseyear();
        Book minBook = shelf.get(0);
        for (Book book : shelf) {
            if (book.getReleaseyear() < min) {
                min = book.getReleaseyear();
                minBook = book;
            }
        }
        return minBook.getBookname();
    }

    public String findLatestBook() {
        int max = shelf.get(0).getReleaseyear();
        Book maxBook = shelf.get(0);
        for (Book book : shelf) {
            if (book.getReleaseyear() > max) {
                max = book.getReleaseyear();
                maxBook = book;
            }
        }
        return maxBook.getBookname();
    }

    public void sortShell() {
        boolean isSorted = false;
        Book buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i].getReleaseyear() > sortArray[i + 1].getReleaseyear()) {
                    isSorted = false;
                    buf = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = buf;
                }
            }
        }
        for (Book book : sortArray) {
            System.out.println(book);
        }


    }


}
