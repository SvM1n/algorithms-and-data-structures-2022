package ru.mirea.practice.task3;

public class CreateImageDocument implements IcreateDocument {
    private DataBase dataBase;

    private String name;

    private String format;


    public CreateImageDocument(String name, String format) {
        this.name = name;
        this.format = format;
        dataBase = DataBase.getInstance();
    }

    @Override
    public Idocument createNew() {
        Idocument idocument = new ImageDocument(name, format);
        dataBase.addFile(idocument);
        return idocument;
    }

    @Override
    public Idocument createOpen() {

        return dataBase.findFile(name, format);

    }
}
