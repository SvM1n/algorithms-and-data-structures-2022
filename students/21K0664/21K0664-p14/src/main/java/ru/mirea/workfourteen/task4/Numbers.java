package ru.mirea.workfourteen.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Numbers {
    public static void main(String[] args) {
        Pattern a = Pattern.compile("\\+");
        Pattern b = Pattern.compile(", ");
        String[] words = b.split("6 / 5 – 2 * 9, (1 + 8) – 9 / 4");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                Matcher matcher = a.matcher(word.charAt(i) + "");
                if (matcher.matches()) {
                    System.out.println(word + " - все гуд");
                    break;
                } else {
                    if (i == word.length() - 1) {
                        System.out.println(word + " - все негуд");
                    }
                }
            }
        }
    }
}
