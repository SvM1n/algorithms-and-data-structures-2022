package ru.mirea.practice.solutiontask4;

public class Shirt {
    private final String number;
    private final String name;
    private final String color;
    private final String size;

    public Shirt(String string) {
        String[] temp = string.split(",");
        number = temp[0];
        name = temp[1];
        color = temp[2];
        size = temp[3];
    }

    @Override
    public String toString() {
        return "Art: " + number + "Name shirt: " + name + "Color: " + color + "Size: " + size;
    }
}
