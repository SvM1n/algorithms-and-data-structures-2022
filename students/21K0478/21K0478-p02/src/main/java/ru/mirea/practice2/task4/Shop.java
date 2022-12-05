package ru.mirea.practice2.task4;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<String, Integer> map = new HashMap<>();

    public void addComputer(Computer pc) {
        this.map.put(pc.getKey(), pc.getValue());
    }

    public void delComputer(String key) {
        this.map.remove(key);
    }

    public void findPc(String key) {
        System.out.println(map.get(key));

    }

    @Override
    public String toString() {
        return "Shop{" + "map=" + map + '}';
    }
}
