package mirea.practice.task3;


public class File {
    Window window = new Window();

    void newFile(String path) {
        window.createNewFile(path);
    }

    void openFile(String path) {
        window.openFile(path);
    }

    void saveFile() {
        System.out.println("file is saving");
    }

    void exitFile() {
        System.out.println("file is closing");
    }
}
