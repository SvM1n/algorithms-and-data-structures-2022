package ru.mirea.practice.s21k0709.task4;

public class Shirts {
    private String article;
    private String name;
    private String color;
    private String size;

    public Shirts(String str) {
        String[] arrStr = str.split(",");
        article = arrStr[0];
        name = arrStr[1];
        color = arrStr[2];
        size = arrStr[3];
    }

    @Override
    public String toString() {
        return "Shirts{"
                +
                "article='" + article + '\''
                +
                ", name='" + name + '\''
                +
                ", color='" + color + '\''
                +
                ", size='" + size + '\''
                +
                '}';
    }
}
