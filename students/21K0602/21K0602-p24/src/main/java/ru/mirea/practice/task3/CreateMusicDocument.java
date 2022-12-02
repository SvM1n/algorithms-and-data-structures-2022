package ru.mirea.practice.task3;

public class CreateMusicDocument implements IcreateDocument {
    private String name;

    private DataBase dataBase;

    private String format;

    public CreateMusicDocument(String name, String format) {
        this.name = name;
        this.format = format;
        dataBase = DataBase.getInstance();
    }

    @Override
    public Idocument createNew() {
        Idocument idocument = new MusicDocument(name, format);
        dataBase.addFile(idocument);
        return idocument;
    }

    @Override
    public Idocument createOpen() {

        return dataBase.findFile(name, format);
    }
}
