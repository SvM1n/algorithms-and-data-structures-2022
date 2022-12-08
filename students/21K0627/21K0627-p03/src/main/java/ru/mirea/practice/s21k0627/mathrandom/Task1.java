package ru.mirea.practice.s21k0627.mathrandom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Double> randomdoub = new ArrayList<Double>();
        int randomint = rand.nextInt(20);
        System.out.println("Amount of elements in array: " + randomint);
        System.out.println("Array of random Double numbers: ");
        for (int i = 0; i < randomint; i++) {
            randomdoub.add(Math.random() * 10);
        }
        for (Double i : randomdoub) {
            System.out.printf("%.2f ", i);
        }
        Collections.sort(randomdoub);
        System.out.println("\nSort array of random Double numbers: ");
        for (Double i : randomdoub) {
            System.out.printf("%.2f ", i);
        }
    }
}
