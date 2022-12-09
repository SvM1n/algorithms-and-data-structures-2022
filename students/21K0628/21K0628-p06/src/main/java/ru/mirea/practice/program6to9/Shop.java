package ru.mirea.practice.program6to9;

public class Shop implements Printable {
    private String name;
    private String description;

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println(name + ", " + description);
    }
}
