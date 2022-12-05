package ru.mirea.practice.task5and6;

public abstract class ThrowsDemo {
    public static void main(String[] args) {
        printMessage("data");
        printMessage(null);
    }

    public static void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException npe) {
            System.err.println("NullPointerException");
            message = "";
        }
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}

