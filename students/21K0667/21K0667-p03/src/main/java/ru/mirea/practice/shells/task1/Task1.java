package ru.mirea.practice.shells.task1;

abstract class Task1 {
    public static void main(String[] args) {
        Double first = Double.valueOf(10.11);
        System.out.println(first);
        Double second = Double.parseDouble("56.389");
        System.out.println(second.byteValue());
        System.out.println(second.floatValue());
        System.out.println(second.intValue());
        System.out.println(second.longValue());
        System.out.println(second.shortValue());
        String third = Double.toString(3.14);
        System.out.println(third);

    }
}
