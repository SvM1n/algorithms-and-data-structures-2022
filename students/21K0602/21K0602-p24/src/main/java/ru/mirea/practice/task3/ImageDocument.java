package ru.mirea.practice.task3;

public class ImageDocument implements Idocument {
    private String name;

    private String format;

    public ImageDocument(String name, String format) {
        this.name = name;
        this.format = format;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFormat() {
        return format;
    }
}
