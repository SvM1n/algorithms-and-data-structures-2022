package mirea.practice.task3;

public class MusicDocument implements IDocument {
    private String path;

    public MusicDocument(String path) {
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
