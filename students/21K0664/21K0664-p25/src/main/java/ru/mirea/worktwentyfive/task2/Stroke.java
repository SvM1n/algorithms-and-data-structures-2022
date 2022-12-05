package ru.mirea.worktwentyfive.task2;

import java.util.regex.Pattern;

abstract class Stroke {
    public static void main(String[] args) {
        Pattern a = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String stroka = "abcdefghijklmnopqrstuv18340";
        String stroka2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(stroka + ":" + a.matcher(stroka).matches());

        System.out.println(stroka2 + ":" + a.matcher(stroka2).matches());
    }
}

