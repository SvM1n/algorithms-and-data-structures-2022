package ru.mirea.practice.spreadsheet;

abstract class Spreadsheet {
    public static void main(String[] args) {
        Double num1 = Double.valueOf("17.4");
        System.out.println(num1);
        String s = "23.432";
        num1 = Double.parseDouble(s);
        System.out.println(num1);
        s = String.valueOf(num1);
        Integer intValue = num1.intValue();
        System.out.println(intValue);
        Float floatValue = num1.floatValue();
        System.out.println(floatValue);
        Byte byteValue = num1.byteValue();
        System.out.println(byteValue);
        Short shortValue = num1.shortValue();
        System.out.println(shortValue);
        Long longValue = num1.longValue();
        System.out.println(longValue);
        String num3 = Double.toString(2.71234);
        System.out.println(num3);
        Double doubleValue = 2.71234;
        num3 = String.valueOf(doubleValue);
        System.out.println(num3);
    }
}

