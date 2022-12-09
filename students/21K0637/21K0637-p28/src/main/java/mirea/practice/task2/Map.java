package mirea.practice.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
    private java.util.Map<String, List<String>> dataBase;
    private int duplicateValue = 0;

    public void createMap() {
        dataBase = new HashMap<>();

        addValue("Ivan", "Ivanov");
        addValue("Maxim", "Karpov");
        addValue("Ivan", "Pavlov");
        addValue("Semen", "Semenov");
        addValue("Andrei", "Ivanov");
        addValue("Andrei", "Persunov");
        addValue("Danila", "Mandarinov");
        addValue("Dmitry", "Karpov");
        addValue("Platon", "Kash");
    }

    private void addValue(String key, String value) {
        if (dataBase.containsKey(key)) {
            dataBase.get(key).add(value);
            duplicateValue++;
        } else {
            List<String> lastNames = new ArrayList<>();
            lastNames.add(value);
            dataBase.put(key, lastNames);
        }
    }

    public int getSameFirstName() {
        return duplicateValue;
    }

    public int getSameLastName() {
        int amount = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            ArrayList<Object> buff = (ArrayList<Object>) dataBase.values().toArray()[i];
            if (buff.size() > 1) {
                amount += buff.size();
            }
        }
        return amount;
    }
}
