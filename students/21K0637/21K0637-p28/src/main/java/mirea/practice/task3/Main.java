package mirea.practice.task3;

import java.util.HashMap;
import java.util.Map;

public abstract class Main {
    public static void main(String[] args) {
        Map<Float, Integer> myMap = new HashMap<>();

        myMap.put(1f, 11);
        myMap.put(2.1f, 10);
        myMap.put(3.2f, 9);
        myMap.put(4.3f, 8);
        myMap.put(5.4f, 7);
        myMap.put(6.6f, 6);

        System.out.println(myMap);
    }
}
