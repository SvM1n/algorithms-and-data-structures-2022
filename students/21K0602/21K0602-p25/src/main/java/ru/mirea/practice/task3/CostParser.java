package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CostParser {

    public static List<String> parse(String strToParse) {
        Pattern compile = Pattern.compile("\\b(([1-9]\\d*\\.?)|(0\\.))\\d+\\s*?((RUB)|(EU)|(USD))\\b");
        Matcher matcher = compile.matcher(strToParse);
        List<String> parsedStringArgs = new ArrayList<>();
        while (matcher.find()) {
            parsedStringArgs.add(matcher.group());

        }
        return parsedStringArgs;

    }

    public static void main(String[] args) {
        List<String> arrayList = parse("123.2 RUB, 2423 ru, 0124 EU,"
            + " 0.324 USD, 121..10 USD, 10.98 USD, efsd23 USDr3232");

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
