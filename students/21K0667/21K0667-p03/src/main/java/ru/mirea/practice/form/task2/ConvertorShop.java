package ru.mirea.practice.form.task2;


import java.text.NumberFormat;
import java.util.Locale;

abstract class ConvertorShop {
    String language;
    String country;
    double course;
    double sum;

    public static String convert(String language, String country, double course, double sum) {
        Locale region = new Locale(language, country);
        double converted = sum * course;
        NumberFormat out = NumberFormat.getCurrencyInstance(region);
        return out.format(converted);
    }


}