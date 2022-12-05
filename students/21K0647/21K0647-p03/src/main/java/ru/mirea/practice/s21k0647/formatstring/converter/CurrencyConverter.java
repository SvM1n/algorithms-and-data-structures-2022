package ru.mirea.practice.s21k0647.formatstring.converter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    double s;
    String from;
    String inlang;
    String inland;
    double course;

    CurrencyConverter(double s, String from, String inlang, String inland, double cource) {
        this.s = s;
        this.from = from;
        this.inlang = inlang;
        this.inland = inland;
        this.course = cource;
    }

    public String formated() {
        Double n = s;
        Locale.setDefault(new Locale(inlang, inland));
        n = n * course;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(n);
    }



    @Override
    public String toString() {
        return "Translation " + s + "\nfrom " + from + " in " + inlang + "\nOutput " + formated();
    }

}
