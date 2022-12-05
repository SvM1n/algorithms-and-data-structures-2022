package ru.mirea.practice.form.task1;


import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
    private String language;
    private String country;
    private double course;
    private String currency;

    public Convertor(String language, String country, double course, String currency) {
        this.language = language;
        this.country = country;
        this.course = course;
        this.currency = currency;
    }

    public String convert(double sum) {
        Locale region = new Locale(language, country);
        double converted = sum * course;
        NumberFormat out = NumberFormat.getCurrencyInstance(region);
        return out.format(converted);
    }


    @Override
    public String toString() {
        return "language='" + language + '\''
                + ", country='" + country + '\''
                + ", course=" + course
                + ", currency='" + currency + '\'';

    }
}