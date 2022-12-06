package ru.mirea.practice.solutiontask5;

public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException exc) {
            System.err.println(exc);
        }
    }

    public String getDetails(String key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }
}
