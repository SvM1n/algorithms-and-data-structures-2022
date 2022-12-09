package ru.mirea.practice.task3;

public class CreateTextDocument implements ICreateDocument {
    private String name;
    private int numberOfCharacters;

    public CreateTextDocument(String name, int numberOfCharacters) {
        this.name = name;
        this.numberOfCharacters = numberOfCharacters;
    }


    @Override
    public IDocument createNew() {
        return new TextDocument(name, numberOfCharacters);
    }
}
