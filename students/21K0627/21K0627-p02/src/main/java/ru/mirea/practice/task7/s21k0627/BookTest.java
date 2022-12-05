package ru.mirea.practice.task7.s21k0627;

import java.util.Scanner;

public abstract class BookTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            do {
                System.out.println("Введите кол-во книг на полке");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }
            } while (n < 0);
            BookShelf mas = new BookShelf();

            for (int i = 0; i < n; i++) {
                String author;
                System.out.println("Введите автора книги:");
                author = sc.next();
                String name;
                System.out.println("Введите название книги:");
                name = sc.next();
                int year;
                System.out.println("Введите год публикации книги:");
                year = sc.nextInt();
                Book b = new Book(author, name, year);
                mas.getBooks().add(b);
            }
            System.out.println(mas.newestBook(mas).getName());
            System.out.println(mas.oldestBook(mas).getName());
            mas.sort(mas, n);
            for (Book s : mas.getBooks()) {
                System.out.println(s.getAuthor() + " " + s.getName() + " " + s.getYear());
            }

        }
    }
}

