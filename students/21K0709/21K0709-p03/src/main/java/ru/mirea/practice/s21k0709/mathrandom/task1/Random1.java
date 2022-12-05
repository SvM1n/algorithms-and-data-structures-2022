package ru.mirea.practice.s21k0709.mathrandom.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Random1 {

    public static void main(String[] args) {
        ArrayList<Double> randdoub = new ArrayList<Double>();
        Random rand = new Random();
        int randint = rand.nextInt(20); // рандомное число объектов массива до 20 не вкл
        System.out.println(randint);
        for (int i = 0; i < randint;i++) {
            randdoub.add(Math.random() * 10); // от 0 до 10
        }
        for (Double i: randdoub) {
            System.out.print(i + " ");
        }
        Collections.sort(randdoub);
        System.out.println();
        for (Double i: randdoub) {
            System.out.print(i + " ");
        }
    }
}
