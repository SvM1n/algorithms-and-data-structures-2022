package ru.mirea.practice.program4;

public class Computer {
    private static int count = 0;
    private String computerType;
    private int capacity;
    private final int id;

    public Computer(String computerType, int capacity)  {
        this.computerType = computerType;
        this.capacity = capacity;
        id = count++;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Computer{"
                +
                "computerType='"
                +
                computerType
                +
                '\''
                +
                ", capacity="
                +
                capacity
                +
                ", id="
                +
                id
                +
                '}';
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public int getId() {
        return id;
    }
}
