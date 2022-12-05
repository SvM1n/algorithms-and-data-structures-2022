package ru.mirea.practice.task5to6;


public class ThrowsDemo {
    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException ne) {
            System.err.println(ne);
            message = "";
        }
        System.out.println(message);
    }

    public String getDetails(String key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        return "data key " + key;
    }


}


