package ru.mirea.practice.s21k0709.task6to9;

public class Shop implements Printable {
    private String author;
    private String name;
    private double releasePeriod;

    public Shop(String author, String name, double releasePeriod) {
        this.author = author;
        this.name = name;
        this.releasePeriod = releasePeriod;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReleasePeriod() {
        return releasePeriod;
    }

    public void setReleasePeriod(double releasePeriod) {
        this.releasePeriod = releasePeriod;
    }


    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Shop{"
                +
                "author='" + author + '\''
                +
                ", name='" + name + '\''
                +
                ", releasePeriod=" + releasePeriod
                +
                '}';
    }
}
