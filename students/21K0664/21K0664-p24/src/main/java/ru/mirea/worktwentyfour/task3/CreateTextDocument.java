package ru.mirea.worktwentyfour.task3;

public interface CreateTextDocument {
    IDocument createNew(String string);

    IDocument createOpen(String string);
}
