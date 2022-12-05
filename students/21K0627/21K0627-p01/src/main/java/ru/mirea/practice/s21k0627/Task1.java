package ru.mirea.practice.s21k0627;

abstract class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nsumma: " + sum);
        System.out.println("average: " + sum / arr.length);
    }
}