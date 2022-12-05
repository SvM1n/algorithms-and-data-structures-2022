package ru.mirea.practice.task3;

public class MusicDocument implements Idocument {
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
    public String getFormat() {
        return format;
    }
}
