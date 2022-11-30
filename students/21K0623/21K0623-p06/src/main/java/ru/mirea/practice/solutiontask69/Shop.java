package ru.mirea.practice.solutiontask69;

public class Shop implements Printable {
    private final String name;
    private final int number;

    public Shop(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name + " номер выпуска " + number);
    }
}
