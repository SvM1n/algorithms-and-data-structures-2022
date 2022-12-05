package ru.mirea.practice.solutiontask5;

public class Book {
    private final String name;
    private final String namebook;

    public Book(String name, String namebook) {
        this.name = name;
        this.namebook = namebook;
    }

    public String getNamebook() {
        return namebook;
    }

    public String getName() {
        return name;
    }
}
