package ru.mirea.practice.s21k0709.format.s21k0709.task2;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    String kodLang;
    String kodLand;
    double course;

    public Converter(String kodLang, String kodLand, double course) {
        this.kodLang = kodLang;
        this.kodLand = kodLand;
        this.course = course;
    }

    public Converter() {
        //
    }

    public String getKodLang() {
        return kodLang;
    }

    public void setKodLang(String kodLang) {
        this.kodLang = kodLang;
    }

    public String getKodLand() {
        return kodLand;
    }

    public void setKodLand(String kodLand) {
        this.kodLand = kodLand;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public String converter(String kodLang, String kodLand, Double course, float sumBasket) {
        Locale sumFormat2 = new Locale(kodLang, kodLand); //определяем локализацию
        NumberFormat sumformat2 = NumberFormat.getCurrencyInstance(sumFormat2); //определяем форматировщик
        return "Amount in " + sumFormat2.getISO3Country() + " " + sumformat2.format(course * sumBasket);
    }

    @Override
    public String toString() {
        return "Converter{"
                +
                "kodLang='" + kodLang + '\''
                +
                ", kodLand='" + kodLand + '\''
                +
                ", course=" + course
                +
                '}';
    }
}
