package ru.mirea.practice.task3;

public class CreateImageDocument implements ICreateDocument {
    private String name;
    private String permission;

    public CreateImageDocument(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    @Override
    public IDocument createNew() {
        return new ImageDocument(name, permission);
    }
}
