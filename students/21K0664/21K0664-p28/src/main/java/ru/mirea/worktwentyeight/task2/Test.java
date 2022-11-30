package ru.mirea.worktwentyeight.task2;

import java.util.HashMap;
import java.util.Map;

public abstract class Test {

    public static Map<String, String> createMap() {
        Map<String, String> a = new HashMap<>();
        a.put("Ivanov", "Ivan");
        a.put("Maximov", "Max");
        a.put("Jackson", "Jack");
        a.put("Jordan", "Vlad");
        a.put("James", "James");
        a.put("Curry", "Stephen");
        a.put("Donchich", "Luko");
        a.put("Jonson", "Alura");

        a.put("Evans", "Chris");
        a.put("Pratt", "Chris");

        return a;
    }

    public static void getSameFirstNameCount(Map<String, String> a) {
        HashMap<String, String> copy = new HashMap<>(a);
        int n = 0;
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) {
                    n += 1;
                }
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Map<String, String> a = createMap();
        System.out.println(a);
        getSameFirstNameCount(a);
        System.out.println(a);
    }
}
