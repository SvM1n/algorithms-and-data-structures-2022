package ru.mirea.practice.task5;


public abstract class Wrappers {
    public static void main(String[] args) {
        Double double1 = Double.valueOf(5.5);

        Double double2 = Double.valueOf("5.5");
        System.out.println(double1);
        System.out.println(double2);

        String double3 = "123.4567";
        Double double4 = Double.parseDouble(double3);
        System.out.println(double4);
        Double double5 = 11.15;
        Byte byte1 = double5.byteValue();
        Integer integer1 = double5.intValue();
        Float float1 = double5.floatValue();
        Long long1 = double5.longValue();
        Short short1 = double5.shortValue();
        System.out.println(byte1);
        System.out.println(integer1);
        System.out.println(float1);
        System.out.println(short1);
        System.out.println(long1);

        final double pi = 3.14;
        String d = Double.toString(pi);
        System.out.println(d);

    }
}

