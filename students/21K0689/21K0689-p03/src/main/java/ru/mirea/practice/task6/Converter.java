package ru.mirea.practice.task6;


import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Converter {
    //private double value;
    private double dollarCourse = 61.32;
    private double euroCourse = 62.22;

    public void dollar(double value) {
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        double newValue = value / dollarCourse;
        System.out.println(numberFormat1.format(newValue));
    }

    public void euro(double value) {
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double newValue = value / euroCourse;
        System.out.println(numberFormat1.format(newValue));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите рубли для конвертации");
            double val = scan.nextDouble();
            Converter converter = new Converter();
            converter.dollar(val);
            converter.euro(val);
        } finally {
            scan.close();
        }
    }

}

