package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        IDocument[] documents = new IDocument[3];
        File file = new File();

        for (int i = 0; i < documents.length; i++) {
            documents[i] = file.newFile();
        }

        try {
            System.out.print(file.openFile(documents));
        } catch (RuntimeException e) {
            System.err.print(e);
        }
    }
}
