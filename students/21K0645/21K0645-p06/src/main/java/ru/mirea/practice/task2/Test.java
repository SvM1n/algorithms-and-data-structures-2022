package ru.mirea.practice.task2;

/* Создать интерфейс Nameable, с методом getName(), возвращающим
имя объекта, реализующего интерфейс. Проверить работу для различных
объектов */

public abstract class Test {
    public static void main(String[] args) {

        Book book = new Book("Student's Book", "Author");
        System.out.println(book.getName());

    }
}
