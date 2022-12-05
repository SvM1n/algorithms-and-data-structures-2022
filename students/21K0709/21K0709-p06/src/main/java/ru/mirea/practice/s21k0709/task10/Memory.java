package ru.mirea.practice.s21k0709.task10;

public class Memory {
    double capacity;
    String name;

    public Memory(double capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Memory{"
                +
                "capacity=" + capacity
                +
                ", name='" + name + '\''
                +
                '}';
    }
}