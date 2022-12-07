package mirea.practice.task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createDocument(String path) {
        return new TextDocument(path);
    }

    @Override
    public IDocument createOpen(String path) {
        return new TextDocument(path);
    }
}
