package ru.mirea.practice.s21k0627.task6to9;

public class Shop implements Printable {
    private String owner;
    private String name;

    public Shop(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public String getAuthor() {
        return owner;
    }

    public void setAuthor(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Shop{"
                + "author='" + owner + '\''
                + ", name='" + name + '\'' + '}';
    }
}
