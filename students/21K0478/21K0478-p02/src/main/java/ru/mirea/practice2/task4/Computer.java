package ru.mirea.practice2.task4;


public class Computer {
    private String key;
    private int value;

    public Computer(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Computer{" +  key + " " + value + '}';
    }

}
