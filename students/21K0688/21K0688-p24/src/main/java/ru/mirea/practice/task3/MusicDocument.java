package ru.mirea.practice.task3;

public class MusicDocument implements IDocument {
    private String name;
    private String format;

    public MusicDocument(String name, String format) {
        this.name = name;
        this.format = format;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicDocument{"
                + "name='" + name + '\''
                + ", format='" + format + '\''
                + '}';
    }
}
