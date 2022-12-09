package ru.mirea.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    public void factorial(int numb) {
        int factorial = 1;
        for (int i = 1; i <= numb; i++) {
            factorial *= i;
        }
        System.out.println("Factorial" + factorial);
    }

    public void arraySumFor(int arrayLen) {
        int[] arr = new int[arrayLen];
        int sum = 0;
        try (Scanner numb = new Scanner(System.in)) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter " + i + " value: ");
                arr[i] = numb.nextInt();
                sum += arr[i];
            }
            numb.close();
            System.out.println("Array now:");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println("\nArray Sum = " + sum);
            System.out.println("Average value = " + ((float) sum / (float) arr.length));

        }

    }

    public void arraySumWhile(int arrayLen) {
        int[] arr = new int[arrayLen];
        int counter = 0;
        try (Scanner numb = new Scanner(System.in)) {
            while (counter < arrayLen) {
                System.out.print("Enter " + counter + " value: ");
                arr[counter] = numb.nextInt();
                counter += 1;
            }
            counter = 0;
            System.out.println("Array now:");
            while (counter < arrayLen) {
                System.out.print(arr[counter] + " ");
                counter += 1;
            }
            Arrays.sort(arr);
            System.out.println("\nMax value in array = " + arr[arrayLen - 1]);
            System.out.println("Min value in array = " + arr[0]);

        }

    }

    public void printArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }

    public void harmonicSeries(int numb) {
        for (int i = 1; i <= numb; i++) {
            System.out.print("1/" + i + ", ");
        }
        System.out.println("\n");
    }

}
