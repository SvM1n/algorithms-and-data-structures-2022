package ru.mirea.practice.task9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Dictionary {
    private final Map<Character, Integer> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void buildDictionary(String str) {
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                dictionary.compute(ch, (character, integer) -> {
                    if (integer != null) {
                        integer++;
                    } else {
                        integer = 1;
                    }
                    return integer;
                });
            }

        }
        for (Map.Entry entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
