package ru.mirea.practice.s21k0709.task5to6;

public class ThrowsDemo {
    public String getDetails(String key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        return "Key: " + key;
    }

    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException npe) {
            System.err.println(npe);
            message = "";
        }
        System.out.println(message);
    }
}