package mirea.practice.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Window {
    Set<IDocument> files = new HashSet<>();

    void createNewFile(String path) {
        Pattern pattern = Pattern.compile("\\.\\w+");
        System.out.println(pattern.matcher(path).matches());
        String extension = pattern.matcher(path).group();

        switch (extension) {
            case ".txt":
                ICreateDocument createDocument = new CreateTextDocument();
                IDocument file = createDocument.createDocument(path);
                files.add(file);
                System.out.println("file creating");
                break;
            case ".mp3":
                createDocument = new CreateMusicDocument();
                file = createDocument.createDocument(path);
                files.add(file);
                System.out.println("file creating");
                break;
            default:
                System.out.println("Invalid extension");
                break;
        }
    }

    IDocument openFile(String path) {
        for (IDocument file: files) {
            if (file.getPath().equals(path)) {
                return file;
            }
        }
        System.out.println("Invalid path");
        return null;
    }
}
