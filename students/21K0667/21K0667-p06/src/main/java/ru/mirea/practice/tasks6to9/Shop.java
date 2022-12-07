package ru.mirea.practice.tasks6to9;

public class Shop implements Printable {
    private String date;
    private String name;

    @Override
    public void print() {
        System.out.println("Название журнла: " + name + ", дата выхода: " + date);
    }


    public Shop(String date, String name) {
        this.date = date;
        this.name = name;
    }
}