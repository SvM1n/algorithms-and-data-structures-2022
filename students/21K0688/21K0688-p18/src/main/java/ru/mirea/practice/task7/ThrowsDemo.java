package ru.mirea.practice.task7;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }

    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            while (!"".equals(myScanner.next()) || myScanner.next() == null) {
                String key = myScanner.next();
                printDetails(key);
            }
        }

    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
