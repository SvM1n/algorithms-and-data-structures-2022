package ru.mirea.practice.tasks789;

public class Book implements Printable {
    private String name;

    Book() {
        this.name = "Undef Book";
    }

    Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable value : printable) {
            if (value instanceof Book) {
                System.out.println(value);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " Book";
    }
}
