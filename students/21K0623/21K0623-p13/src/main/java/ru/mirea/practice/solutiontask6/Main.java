package ru.mirea.practice.solutiontask6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Collections;
import java.util.Scanner;

public final class Main {
    private Main() {}

    public static boolean firstLast(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String tempf = list.get(i).toLowerCase(Locale.ROOT);
            String temps = list.get(i + 1).toLowerCase(Locale.ROOT);
            if (tempf.charAt(tempf.length() - 1) != temps.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static StringBuilder getLine(String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        StringBuilder finish = new StringBuilder();
        while (firstLast(list)) {
            Collections.shuffle(list);
        }
        for (String a: list) {
            finish.append(a).append(" ");
        }
        return finish;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] words = new String(Files.readAllBytes(Path.of(sc.next()))).split(", ");
            System.out.println(getLine(words));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
