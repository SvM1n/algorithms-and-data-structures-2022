package ru.mirea.practice.shell;

public final class Program1 {
    private Program1() {
    }

    public static void main(String[] args) {

        Double value = Double.valueOf(4.444);
        System.out.println(value);

        Double value1 = Double.parseDouble("5.7");
        System.out.println(value1);

        System.out.println(value1.byteValue());
        System.out.println(value1.shortValue());
        System.out.println(value1.intValue());
        System.out.println(value1.longValue());
        System.out.println(value1.floatValue());

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}