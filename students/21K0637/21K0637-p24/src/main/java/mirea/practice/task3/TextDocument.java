package mirea.practice.task3;

public class TextDocument implements IDocument {
    private String path;

    public TextDocument(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
