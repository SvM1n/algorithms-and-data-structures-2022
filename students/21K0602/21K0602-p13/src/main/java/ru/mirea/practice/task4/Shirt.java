package ru.mirea.practice.task4;

public class Shirt {
    private String article;
    private String fullName;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] temp = str.split(",");
        article = temp[0];
        fullName = temp[1];
        color = temp[2];
        size = temp[3];
    }

    @Override
    public String toString() {
        return "Shirts{" + "article='" + article + '\'' + ", fullName='" + fullName + '\'' + ", color='"
                + color + '\'' + ", size='" + size + '\'' + '}';
    }
}
