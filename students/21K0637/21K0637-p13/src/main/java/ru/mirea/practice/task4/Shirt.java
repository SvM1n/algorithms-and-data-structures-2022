package ru.mirea.practice.task4;

public class Shirt {
    private final String article;
    private final String fullname;
    private final String color;
    private final String size;

    public Shirt(String parseString) {
        String[] attributes = parseString.split(",");
        this.article = attributes[0];
        this.fullname = attributes[1];
        this.color = attributes[2];
        this.size = attributes[3];
    }

    @Override
    public String toString() {
        return "Shirt{"
            + "article='" + article + '\''
            + ", fullname='" + fullname + '\''
            + ", color='" + color + '\''
            + ", size='" + size + '\''
            + '}';
    }
}

