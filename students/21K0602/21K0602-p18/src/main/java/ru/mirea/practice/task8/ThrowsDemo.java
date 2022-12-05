package ru.mirea.practice.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {

        try (Scanner myScanner = new Scanner(System.in)) {
            String key;
            while (!"stop".equals(myScanner.next())) {
                key = myScanner.next();
                printDetails(key);
            }
        }

    }

    public void printDetails(String key) {
        String message;
        try {
            message = getDetails(key);

        } catch (Exception e) {
            System.err.println(e);
            message = "empty message";

        }
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        } else {
            return "data for " + key;
        }

    }


}
