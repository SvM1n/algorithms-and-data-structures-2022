package ru.mirea.practice.task4;

public class Shirt {
    private String article;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] temp = str.split(",");
        article = temp[0];
        name = temp[1];
        color = temp[2];
        size = temp[3];
    }

    @Override
    public String toString() {
        return "Shirt{"
                + "article='" + article + '\''
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + ", size='" + size + '\''
                + '}';
    }
}
