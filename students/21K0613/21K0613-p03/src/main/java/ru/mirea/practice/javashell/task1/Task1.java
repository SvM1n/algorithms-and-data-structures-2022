package ru.mirea.practice.javashell.task1;

abstract class Task1 {
    public static void main(String[] args) {
        //1
        Double num = Double.valueOf(3);
        //2
        String str = "6";
        double num1 = Double.parseDouble(str);
        System.out.println(num1);
        //3
        short shortNum = num.shortValue();
        System.out.println(shortNum);
        byte byteNum = num.byteValue();
        System.out.println(byteNum);
        double doubleNum = num;
        System.out.println(doubleNum);
        float floatNum = num.floatValue();
        System.out.println(floatNum);
        int intNum = num.intValue();
        System.out.println(intNum);
        long longNum = num.longValue();
        System.out.println(longNum);
        //4
        System.out.println(num);
        //5
        double num2 = 3.5;
        String stringNum = String.valueOf(num2);
        System.out.println(stringNum);


    }
}
