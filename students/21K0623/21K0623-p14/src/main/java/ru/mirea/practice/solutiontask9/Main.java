package ru.mirea.practice.solutiontask9;

import java.util.Locale;

public final class Main {
    private Main() {}

    public static void getCount(String str) {
        System.out.println(str);
        str = str.toLowerCase(Locale.ROOT);
        int[] counter = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter <= 'z' && letter >= 'a') {
                counter[letter - 'a']++;
            }
        }
        System.out.println("finish");
        for (int i = 0; i < counter.length; i++) {
            System.out.println((char)(i + 'a') + " = " + counter[i]);
        }
    }

    public static void main(String[] args) {
        getCount("I love Java!!!");
    }
}
