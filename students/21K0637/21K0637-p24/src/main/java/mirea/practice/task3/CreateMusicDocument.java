package mirea.practice.task3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createDocument(String path) {
        return new MusicDocument(path);
    }

    @Override
    public IDocument createOpen(String path) {
        return new MusicDocument(path);
    }
}
