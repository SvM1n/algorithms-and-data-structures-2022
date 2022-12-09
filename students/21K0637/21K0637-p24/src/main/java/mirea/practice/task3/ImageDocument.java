package mirea.practice.task3;

public class ImageDocument implements IDocument {
    private String path;

    public ImageDocument(String path) {
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
