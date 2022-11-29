package ru.mirea.practice.program8;

abstract class Tester {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "f"};
        String temp;
        int n = arr.length;
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
