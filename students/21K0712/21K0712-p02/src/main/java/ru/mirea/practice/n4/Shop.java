package ru.mirea.practice.n4;

import java.util.Arrays;

public class Shop {
    private int max = 10;
    private int[] computer = new int[max];
    private int counter;

    Shop(int counter) {
        this.counter = counter;

        for (int i = 0; i < counter; i++) {
            computer[i] = 1;
        }
    }

    public double getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addComputer(int a) {
        if ((this.counter + a) > 10) {
            this.counter = 10;
        }
        this.counter += a;
    }

    public void delComputer(int a) {
        if ((this.counter - a) < 0) {
            this.counter = 0;
        }
        this.counter -= a;
    }

    public void findComputer(int a) {
        if (a < 0 || a > 10) {
            System.out.println("Error");
        } else if (computer[a] == 0) {
            System.out.println("Компьютера " + a + " нет в наличии");
        }
        System.out.println("Компьютер " + a + " есть на складе");
    }

    @Override
    public String toString() {
        return "Shop{"
                +
                "max=" + max
                +
                ", computer=" + Arrays.toString(computer)
                +
                ", counter=" + counter
                +
                '}';
    }
}