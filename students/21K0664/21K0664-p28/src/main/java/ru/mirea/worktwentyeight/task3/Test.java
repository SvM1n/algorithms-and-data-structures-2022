package ru.mirea.worktwentyeight.task3;

import java.util.HashMap;

public abstract class Test {
    public static void main(String[] args) {
        HashMap<Float, String> a = new HashMap<>();

        a.put(13f, "qwer");

        a.put(21f, "asd");

        a.put(812313f, "Hello World");

        System.out.println(a);


    }
}
