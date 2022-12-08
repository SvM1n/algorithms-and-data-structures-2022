package ru.mirea.practice.javashell.task1;

abstract class task1 {
    public static void main(String[] args){
        //1
        Double num = Double.valueOf(3);
        //2
        String str = "6";
        double num1 = Double.parseDouble(str);
        //3
        short shortNum = num.shortValue();
        byte byteNum = num.byteValue();
        double doubleNum = num;
        float floatNum = num.floatValue();
        int intNum = num.intValue();
        long longNum = num.longValue();
        //4
        System.out.println(num);
        //5
        double num2 = 3.5;
        String stringNum = String.valueOf(num2);


    }
}
