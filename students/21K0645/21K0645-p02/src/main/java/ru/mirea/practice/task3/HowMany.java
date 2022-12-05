package ru.mirea.practice.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class HowMany {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String: ");
        String inputLine = bufferedReader.readLine();

        int counter = (int) Pattern.compile("\\w+").matcher(inputLine).results().count();

        System.out.println(counter);
    }
}
