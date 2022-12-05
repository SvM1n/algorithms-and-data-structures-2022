package ru.mirea.worktwentyfive.task3;

import java.util.regex.Pattern;

abstract class Money {
    public static void main(String[] args) {
        Pattern dollar = Pattern.compile("USD");
        Pattern euro = Pattern.compile("EU");
        Pattern ruble = Pattern.compile("RUB");

        System.out.println(dollar.matcher("25.98 USD").find());
        System.out.println(euro.matcher("44 ERR").find());
        System.out.println(ruble);
    }
}
