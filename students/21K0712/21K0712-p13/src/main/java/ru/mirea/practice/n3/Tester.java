package ru.mirea.practice.n3;

import java.util.StringTokenizer;

abstract class Tester {
    public static void main(String[] args) {
        Address a = new Address("Country, Region, City, Street, House, Housing, Apartment");
        System.out.println(a.toString());
        Address b = new Address("1, 2, 3, 4, 5, 6, 7");
        System.out.println(b.toString());
        StringTokenizer str = new StringTokenizer("111, 222, 333, 444; 555. 666, 777", ",.;");
        while (str.hasMoreTokens()) {
            String en = str.nextToken();
            en = en.replace(" ", "");
            System.out.println(en + " ");
        }


    }
}
