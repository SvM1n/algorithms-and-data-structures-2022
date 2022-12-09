package ru.mirea.practice.s21k0627.p41.task5;

import java.util.ArrayList;
import java.util.List;

public abstract class Test {
    public static void main(String[] args) {
        Reader reader = new Reader("Иванов П.В.", 10003203, "III", "14.12.2002", "+79997773321");
        System.out.println(reader.takeBook(2));
        Book book1 = new Book("История России");
        Book book2 = new Book("Математический анализ");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        System.out.println(reader.takeBook(books));
        System.out.println(reader.returnBook(2));
        System.out.println(reader.returnBook(books));
    }
}
