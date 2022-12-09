package ru.mirea.practice.task3;

public class ImageDocument implements IDocument {
    private String name;
    private String permission;

    public ImageDocument(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImageDocument{"
                + "name='" + name + '\''
                + ", permission='" + permission + '\''
                + '}';
    }
}
