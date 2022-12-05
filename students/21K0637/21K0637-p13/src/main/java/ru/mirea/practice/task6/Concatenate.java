package ru.mirea.practice.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

abstract class Concatenate {
    static String[] words;

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) {
            return new StringBuilder();
        } else if (words.length == 1) {
            return new StringBuilder(words[0]);
        }

        StringBuilder result = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        while (list.remove("")) {
            list.remove("");
        }

        while (sortingList(list)) {
            Collections.shuffle(list);
        }
        for (String word : list) {
            result.append(word).append(" ");
        }
        return result;
    }

    private static boolean sortingList(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String firstWord = list.get(i).toLowerCase(Locale.ENGLISH);
            String secondWord = list.get(i + 1).toLowerCase(Locale.ENGLISH);
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    static void fileRead() {
        String path;
        try (Scanner sc = new Scanner(System.in)) {
            path = sc.nextLine();
            words = new String(Files.readAllBytes(Paths.get(path))).split(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void getResult() {
        System.out.println(getLine(words));
    }
}

