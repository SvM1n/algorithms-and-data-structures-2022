package ru.mirea.practice.task7.s21k0709;

import java.util.Scanner;

public abstract class BookTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0;
            do {
                System.out.println("Введите кол-во книг на полке");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j < 0);
            BookShelf mas = new BookShelf();

            for (int i = 0; i < j; i++) {
                String name;
                System.out.println("Введите название книги:");
                name = sc.next();
                System.out.println("Введите год публикации книги:");
                int yearpubl;
                yearpubl = sc.nextInt();
                Book t = new Book(name, yearpubl);
                mas.getBooks().add(t);
            }
            for (Book k : mas.getBooks()) {
                System.out.println(k.getName() + " " + k.getYearpublish());
            }
            System.out.println(mas.maxPublYear(mas).getName());
            System.out.println(mas.minPublYear(mas).getName());
            mas.sort(mas, j);
            for (Book k : mas.getBooks()) {
                System.out.println(k.getName() + " " + k.getYearpublish());
            }

        }
    }
}
