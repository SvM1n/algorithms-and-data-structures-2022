package ru.mirea.practice.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShopInn {
    public boolean checkInn(String inn) {
        Pattern pattern = Pattern.compile("\\d{12}");
        Matcher matcher = pattern.matcher(inn);
        return matcher.matches();
    }
}
