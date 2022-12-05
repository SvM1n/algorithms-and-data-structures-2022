package ru.mirea.practice.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        String[] strings = {"user@mail.ru", " @bk.ru", "myhost@@@com.ru", "arsushaXudyakou2003@gmail.com"};
        for (String s : strings) {
            System.out.println(s);
        }
        filter(strings, new Filter() {
            @Override
            public boolean apply(Object o) {
                Pattern pattern = Pattern.compile("\\D\\w+@\\w+\\.+\\w+");
                Matcher matcher = pattern.matcher(o.toString());
                return matcher.matches();
            }
        });
        System.out.println("------------------------------------");
        for (String string : strings) {
            System.out.println(string);
        }


    }

    public static void filter(Object[] arr, Filter filter) {
        for (int i = 0; i < arr.length; i++) {
            if (!filter.apply(arr[i])) {
                arr[i] = "";
            }
        }
    }
}
