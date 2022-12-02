package ru.mirea.practice.task3;

import java.util.Stack;

public final class DataBase {

    private Stack<Idocument> files;

    private DataBase() {
        files = new Stack<>();
    }


    //Singleton Pattern

    private static class ShopSingletonHelper {
        private static final DataBase INSTANCE = new DataBase();
    }

    public static DataBase getInstance() {
        return ShopSingletonHelper.INSTANCE;
    }

    public Idocument findFile(String name, String format) {
        for (Idocument document : files) {
            if (name.equals(document.getName()) && format.equals(document.getFormat())) {
                return document;
            }
        }
        System.out.println("File not found");
        return null;
    }

    public void addFile(Idocument idocument) {
        files.push(idocument);

    }

    public void printFiles() {
        for (Idocument document : files) {
            System.out.println(document.getName() + "." + document.getFormat());
        }
    }
}
