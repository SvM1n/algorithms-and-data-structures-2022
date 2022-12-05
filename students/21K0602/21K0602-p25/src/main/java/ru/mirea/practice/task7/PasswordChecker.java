package ru.mirea.practice.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PasswordChecker {
    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("(?=.*_)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\w{8,}");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

}
