package ru.mirea.worktwentyfour.task3;

public class Document {
    private CreateDocument create;

    public void thenew(String string) {
        create.createNew(string);
    }

    public void open(String string) {
        create.createOpen(string);
    }

    public void save() {
        System.out.println("Saved");
    }

    public void exit() {
        System.out.println("Done");
    }

}
