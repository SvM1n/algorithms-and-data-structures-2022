package ru.mirea.practice.s21k0627.shell;

public abstract class Task1 {
    public static void main(String[] args) {
        Double a = Double.valueOf(3);
        Double b = a.valueOf("4");
        String s = "92.1";
        Double p = Double.parseDouble(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
        System.out.println(p.byteValue());
        System.out.println(p.floatValue());
        System.out.println(p.intValue());
        System.out.println(p.longValue());
        System.out.println(p.shortValue());
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
