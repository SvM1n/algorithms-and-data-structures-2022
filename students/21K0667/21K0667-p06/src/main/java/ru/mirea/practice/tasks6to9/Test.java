package ru.mirea.practice.tasks6to9;

public abstract class Test {
    public static void main(String[] args) {
        Printable[] arr = {new Book("Центр тяжести", "Поляринов"), new Shop("28.05.21", "Аргументы и факты")};
        for (Printable printable : arr) {
            printable.print();
        }
    }
}