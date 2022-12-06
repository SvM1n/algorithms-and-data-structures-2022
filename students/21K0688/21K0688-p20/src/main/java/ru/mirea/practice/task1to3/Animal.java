package ru.mirea.practice.task1to3;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        System.out.print("Sound!");
    }

    @Override
    public String toString() {
        return "Animal{"
                + "type='" + type + '\''
                + ", name='" + name + '\''
                + '}';
    }
}
