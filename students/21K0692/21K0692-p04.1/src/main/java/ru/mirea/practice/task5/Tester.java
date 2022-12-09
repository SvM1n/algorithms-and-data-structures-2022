package ru.mirea.practice.task5;

public abstract class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Арсюша Худякоу");

        reader.takeBook(4);
        System.out.print("\n");
        reader.takeBook("Война и мир", "Преступление и наказание", "Бедная Лиза", "Гроза");
        Book[] arr = {new Book("Заводной апельсин"),
            new Book("Мертвые души"),
            new Book("На дне"),
            new Book("Капитанская дочка")};
        System.out.print("\n");
        reader.takeBook(arr);
        System.out.print("\n------------------------------------------------------------------------------------------");
        System.out.print("\n");
        reader.returnBook(4);
        System.out.print("\n");
        reader.returnBook("Война и мир", "Преступление и наказание", "Бедная Лиза", "Гроза");
        System.out.print("\n");
        reader.returnBook(arr);
    }
}
