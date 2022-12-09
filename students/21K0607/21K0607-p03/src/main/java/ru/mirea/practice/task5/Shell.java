package ru.mirea.practice.task5;

public abstract class Shell {
    public static void main(String[] args) {
        Double value = Double.valueOf("2.123");
        System.out.println(value);
        String str = "457.6";
        value = Double.parseDouble(str);
        Integer integer = value.intValue();
        System.out.println(integer);
        Byte byt = value.byteValue();
        System.out.println(byt);
        Long lng = value.longValue();
        System.out.println(lng);
        Float flt = value.floatValue();
        System.out.println(flt);
        Short sht = value.shortValue();
        System.out.println(sht);
        String d = Double.toString(3.14);
        System.out.println(d);
        Double dbl = 3.141;
        d = String.valueOf(dbl);
        System.out.println(d);
    }
}
