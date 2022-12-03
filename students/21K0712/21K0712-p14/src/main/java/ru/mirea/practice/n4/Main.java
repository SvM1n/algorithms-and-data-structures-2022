package ru.mirea.practice.n4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile(", ");
        String[] words = pat.split("6 / 5 – 2 * 9, (1 + 8) – 9 / 4");

        Pattern p = Pattern.compile("\\+");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                Matcher m = p.matcher(word.charAt(i) + "");
                if (m.matches()) {
                    System.out.println(word);
                    break;
                } else {
                    if (i == word.length() - 1) {
                        System.out.println("Error");
                    }
                }
            }
        }
    }
}
