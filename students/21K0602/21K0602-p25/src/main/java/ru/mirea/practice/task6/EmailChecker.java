package ru.mirea.practice.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class EmailChecker {

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("^((\\w+)|(\".+\")|([^a-zA-Z0-9_@]+))@\\w+.\\w+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(check("d3svdWnksnv@gmail.com"));
        System.out.println(check("\"Alan Turi@g\"@example.com"));
        System.out.println(check("!#@example.com"));
        System.out.println(check("myhost@@@com.ru"));
        System.out.println(check("@@gmail.com"));
    }
}
