package mirea.practice.task9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class FrequencyDictionary {
    static void getDictionary(String text) {
        text = text.toLowerCase(Locale.ENGLISH);
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Pattern.matches("[a-zA-Z]?", String.valueOf(ch))) {
                dictionary.compute(ch, (character, integer) -> integer == null ? 1 : integer + 1);
            }
        }

        dictionary.forEach((a, b) -> System.out.println(a + ": " + b));
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consect25etur adipiscing elit, "
            + "sed; do eiusmod tempor incidi532dunt ut labore et dolore magna aliqua. "
            + "Ut enim ad mi342nim 45veniam, quis nostrud exercita253tion ullamco laboris "
            + "ni253si; ut aliquip ex ea commodo consequat.";
        getDictionary(text);
    }
}
