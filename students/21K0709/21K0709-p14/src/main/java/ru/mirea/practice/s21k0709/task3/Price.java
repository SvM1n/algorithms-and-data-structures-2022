package ru.mirea.practice.s21k0709.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Price {

    public static List<String> parse(String strToParse) {
        Pattern pattern = Pattern.compile("\\b(([1-9]\\d*\\.?)|(0\\.))\\d+\\s*?((USD)|(RUB)|(EU))\\b");
        Matcher matcher = pattern.matcher(strToParse);
        List<String> parsedStringArgs = new ArrayList<>();
        while (matcher.find()) {
            parsedStringArgs.add(matcher.group());

        }
        return parsedStringArgs;

    }

    public static void main(String[] args) {
        List<String> list = parse("123.2 USD, 2423.5 usd, 0124 RUB,"
                + " 0.324 rub, 12110 eu, 10.98 EU, abcdRub usD214");

        for (String str : list) {
            System.out.println(str);
        }
    }
}