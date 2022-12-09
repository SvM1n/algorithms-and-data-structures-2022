package ru.mirea.practice.task3;

/*Напишите программу HowMany.java, которая определит, сколько
 слов Вы ввели с консоли*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public final class HowMany {
    private HowMany() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) throws IOException {

        int counter;
        System.out.println("Enter a String: ");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputLine = bufferedReader.readLine();
            counter = (int) Pattern.compile("\\w+").matcher(inputLine).results().count();
        }

        System.out.println(counter);
    }
}
