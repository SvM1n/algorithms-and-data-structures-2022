package ru.mirea.practice.task3;

public class TextDocument implements IDocument {
    private String name;
    private int numberOfCharacters;

    public TextDocument(String name, int numberOfCharacters) {
        this.name = name;
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TextDocument{"
                + "name='" + name + '\''
                + ", numberOfCharacters=" + numberOfCharacters
                + '}';
    }
}
