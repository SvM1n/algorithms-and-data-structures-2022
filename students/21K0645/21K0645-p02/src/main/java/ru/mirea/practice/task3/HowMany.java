package ru.mirea.practice.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public final class HowMany {
    private HowMany() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a String: ");

        String inputLine;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            inputLine = bufferedReader.readLine();
        }

        int counter = (int) Pattern.compile("\\w+").matcher(inputLine).results().count();
        System.out.println(counter);

    }
}
