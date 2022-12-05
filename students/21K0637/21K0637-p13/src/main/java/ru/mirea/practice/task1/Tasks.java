package ru.mirea.practice.task1;

import java.util.Locale;
import java.util.Scanner;

public abstract class Tasks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String inputString = sc.nextLine();
            System.out.println("Last chr: " + inputString.charAt(inputString.length() - 1));
            System.out.println("last symbols is '!!!': " + inputString.endsWith("!!!"));
            System.out.println("first symbols is 'I like': " + inputString.startsWith("I like"));
            System.out.println("Contains 'Java': " + inputString.contains("Java"));
            System.out.println("'Java' start with " + inputString.indexOf("Java"));
            System.out.println(inputString.replace("a", "o"));
            System.out.println(inputString.toUpperCase(Locale.ENGLISH));
            System.out.println(inputString.toLowerCase(Locale.ENGLISH));
            System.out.println(inputString.substring(inputString.indexOf("Java"),
                inputString.indexOf("Java") + "Java".length()));

        }
    }
}
