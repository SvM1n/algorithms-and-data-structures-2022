package ru.mirea.practice.task2;

/* Создать интерфейс Nameable, с методом getName(), возвращающим
имя объекта, реализующего интерфейс. Проверить работу для различных
объектов */

public class Book implements Nameable {
    private final  String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }

}
