package practice.part1;

import java.util.Random;
import java.util.Scanner;

//!!task 4 = task 5!!
public abstract class Main {
    public static void main(String[] args) {
        Random rad = new Random();
        int[] arr1 = new int[10];
        for (int i = 0; i < 5; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }
        for (int i = 5; i < 10; i++) {
            arr1[i] = rad.nextInt(10);
        }
        System.out.println("generated array ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.println("sorted array");
        int max;
        int index;
        for (int i = 0; i < 9; i++) {
            max = arr1[i];
            index = i;
            for (int j = i; j < 10; j++) {
                if (max < arr1[j]) {
                    index = j;
                    max = arr1[j];
                }

            }
            max = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = max;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }

        Tester test = new Tester(10);
        System.out.println(test.findMax() + " " + test.findMin());


        System.out.println(" task 3 ");
        int[] arr2 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr2[i] = (int) (Math.random() * 89 + 10);
            System.out.print(" " + arr2[i]);

        }
        boolean b = true;
        for (int i = 0; i < 3; i++) {
            if (arr2[i] >= arr2[i + 1]) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println(" goes up");
        } else {
            System.out.println(" doesn't go up");
        }

        try (Scanner c4 = new Scanner(System.in)) {
            System.out.println("task 4");
            System.out.println("Input size of your array");
            int n = 0;
            while (true) {
                if (c4.hasNextInt()) {
                    n = c4.nextInt();
                    break;
                } else {
                    c4.next();
                }
            }
            int[] arr4 = new int[n];
            int count = 0;
            System.out.println("non-sorted:");
            for (int i = 0; i < n; i++) {
                arr4[i] = (int) (Math.random() * n);
                System.out.print(" " + arr4[i]);
                if (arr4[i] % 2 == 0) {
                    count++;
                }
            }
            int[] arr42 = new int[count];
            System.out.println(" ");
            System.out.println("Sorted:");
            for (int i = 0; i < n; i++) {
                if (arr4[i] % 2 == 0) {
                    arr42[count - 1] = arr4[i];
                    System.out.print(" " + arr42[count - 1]);
                    count--;

                }
            }

        }
    }
}