package ru.mirea.practice.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        String string = "0.25 eee, rr, 0.25 EU, 27.89 RUB, 1g3.2, 10 USD, 1.1234 RUB, EU";
        Pattern pattern = Pattern.compile("\\d+(|.\\d+) (RUB|USD|EU)");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
