package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Main {
    public static void main(String[] args) {
        Map<String, String> peoples = createMap();
        System.out.println(getSameFirstNameCount(peoples));

    }

    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();
        people.put("Davydov", "Denis");
        people.put("ldksn", "Vlad");
        people.put("Cody", "Crawford");
        people.put("Uvuvwevwevwe", "Denis");
        people.put("Onyetenyevwe", "Crawford");
        people.put("Ugwemuhwem", "Vova");
        people.put("Osas", "Vlad");
        people.put("Cody", "Ford");
        people.put("Lumbert", "Reev");
        people.put("Johny", "Crawford");
        System.out.println(people);
        return people;
    }


    public static int getSameFirstNameCount(Map<String, String> people) {
        List<String> checkedNames = new ArrayList<>();
        List<String> names = new ArrayList<>(people.values());
        int nameCount = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                try {
                    if (!checkedNames.contains(names.get(i))) {
                        checkedNames.add(names.get(i));
                    }
                    if (names.get(i).equals(names.get(j)) && i != j) {
                        nameCount++;
                    }

                    if (j + 1 == names.size()) {
                        names.remove(checkedNames.get(i));
                    }
                } catch (IndexOutOfBoundsException ex) {
                    break;
                }
            }
        }
        return nameCount;
    }

}
