package mirea.practice.task7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        String key;
        try (Scanner myScanner = new Scanner(System.in)) {
            key = myScanner.next();
        }
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
