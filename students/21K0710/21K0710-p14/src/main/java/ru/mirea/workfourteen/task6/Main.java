package ru.mirea.workfourteen.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*");
        Matcher matcher = pattern.matcher("user@example.com");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("user@example.com");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("myhost@@@com.ru");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("@my.ru");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("Julia String");
        System.out.println(matcher.matches());
    }
}
