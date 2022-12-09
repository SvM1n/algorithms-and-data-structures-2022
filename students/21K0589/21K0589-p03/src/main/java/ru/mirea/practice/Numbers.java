package ru.mirea.practice;

import java.util.Random;

public class Numbers {

    public Integer[] randomArray(int size) {
        Integer[] arr = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        sortBubble(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        return arr;
    }

    public Integer[] mathRandomArray(int size) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 25);
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        sortBubble(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        return arr;
    }


    public static void sortBubble(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int h = 0; h < arr.length - i - 1; h++) {
                Integer temp = arr[h];
                if (arr[h] > arr[h + 1]) {
                    arr[h] = arr[h + 1];
                    arr[h + 1] = temp;
                }
            }
        }
    }
}
