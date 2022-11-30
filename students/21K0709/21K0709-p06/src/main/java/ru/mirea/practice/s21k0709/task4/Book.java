package ru.mirea.practice.s21k0709.task4;

public class Book implements Priceable {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{"
                +
                "name='" + name + '\''
                +
                ", price=" + price
                +
                ", author='" + author + '\''
                +
                '}';
    }
}
