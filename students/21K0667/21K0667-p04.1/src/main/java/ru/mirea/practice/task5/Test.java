package ru.mirea.practice.task5;

public abstract class Test {
    public static void main(String[] args) {
        Reader reader = new Reader("Иван Иванов", 1000);

        reader.takeBook(2);
        System.out.println();
        reader.takeBook("Нейромант", "Лавина");
        Book[] arr = {new Book("Виртуальный свет"),
            new Book("Криптономикон")};
        System.out.println();
        reader.takeBook(arr);
        System.out.println("\n");
        reader.returnBook(2);
        System.out.print("\n");
        reader.returnBook("Нейромант", "Лавина");
        System.out.println();
        reader.returnBook(arr);
    }
}
