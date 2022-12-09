package ru.mirea.practice.task3;

public class Product implements Nameable {
    String name;

    Product(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
