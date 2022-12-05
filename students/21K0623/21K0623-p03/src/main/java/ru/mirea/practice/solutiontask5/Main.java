package ru.mirea.practice.solutiontask5;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Double num = Double.valueOf(10.5);
        System.out.println(num);

        String temp = "1234.1234";
        Double numsecond = Double.parseDouble(temp);
        System.out.println(numsecond);

        System.out.println(numsecond.byteValue());
        System.out.println(numsecond.doubleValue());
        System.out.println(numsecond.floatValue());
        System.out.println(numsecond.intValue());
        System.out.println(numsecond.longValue());

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
