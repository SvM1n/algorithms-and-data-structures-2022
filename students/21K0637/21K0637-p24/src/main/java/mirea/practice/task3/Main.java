package mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        File file = new File();
        file.newFile("src/text.txt");
        file.openFile("src/text.txt");
        file.saveFile();
        file.exitFile();
    }
}
