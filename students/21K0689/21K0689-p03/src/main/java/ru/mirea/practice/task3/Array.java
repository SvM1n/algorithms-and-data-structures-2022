package ru.mirea.practice.task3;

import java.util.Arrays;
import java.util.Random;

public abstract class Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(91) + 9;
        }
        System.out.println(Arrays.toString(a));
        /*int tmp;
        for (int i = 0; i < a.length / 2; i++)
        {
            for (int j = a.length-1; j > 0 ; j--)
            {
                if (a[i]>a[j])
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));*/

        boolean check = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("Строго возрастает");
        } else {
            System.out.println("Не возрастает");
        }
    }
}

