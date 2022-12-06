package ru.mirea.practice.task3;

public class CreateMusicDocument implements ICreateDocument {
    private String name;
    private String format;

    public CreateMusicDocument(String name, String format) {
        this.name = name;
        this.format = format;
    }


    @Override
    public IDocument createNew() {
        return new MusicDocument(name, format);
    }
}
