package ru.mirea.practice.s21k0709.p401.task5;

import java.util.ArrayList;
import java.util.List;

public abstract class Tester {
    public static void main(String[] args) {
        Reader man1 = new Reader("Петров В.А", 5042,10,2003,"79301234221");
        System.out.println(man1.takeBook(5));
        Book book1 = new Book("Энциклопедия");
        Book book2 = new Book("Словарь");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        System.out.println(man1.takeBook(books));
        System.out.println(man1.returnBook(5));
        System.out.println(man1.returnBook(books));
    }
}
