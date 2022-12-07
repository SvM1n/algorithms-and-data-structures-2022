package ru.mirea.practice.solutiontask1;

import java.io.Serializable;

public class Animal implements Serializable {
    private final String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
