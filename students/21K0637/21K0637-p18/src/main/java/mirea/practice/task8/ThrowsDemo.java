package mirea.practice.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);
            try {
                String key = myScanner.next();
                printDetails(key);
                return;
            } catch (Exception exc) {
                System.err.println("Error");
            } finally {
                myScanner.close();
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

