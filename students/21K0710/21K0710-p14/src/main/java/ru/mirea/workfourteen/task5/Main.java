package ru.mirea.workfourteen.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(0[1-9]|1\\d|2\\d|3[01])\\/(0[1-9]|1[0-2])\\/(19|[2-9]\\d)\\d{2}$");
        Matcher matcher = pattern.matcher("29/02/2000");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("30/04/2003");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("01/01/2003");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("30-04-2003");
        System.out.println(matcher.matches());
        matcher = pattern.matcher(" 1/1/1899");
        System.out.println(matcher.matches());
    }
}
