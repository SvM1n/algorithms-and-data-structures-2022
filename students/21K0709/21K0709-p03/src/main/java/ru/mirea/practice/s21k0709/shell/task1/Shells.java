package ru.mirea.practice.s21k0709.shell.task1;

public abstract class Shells {
    public static void main(String[] args) {
        Double x = Double.valueOf(5);
        Double y = x.valueOf("3");
        String s = "55.5";
        Double a = Double.parseDouble(s);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(a.byteValue());
        System.out.println(a.floatValue());
        System.out.println(a.intValue());
        System.out.println(a.longValue());
        System.out.println(a.shortValue());
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}