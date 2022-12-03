package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 2, 3, 7, 9, 12};
        MinMax<Integer> minMax = new MinMax<>(arr);

        System.out.print("Arr: ");
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

        System.out.print("\nMin: " + minMax.min());
        System.out.print("\nMax: " + minMax.max() + "\n");

        System.out.print("arr[2] + arr[3] = " + Calculator.sum(arr[2], arr[3]));
        System.out.print("\narr[2] * arr[3] = " + Calculator.multiply(arr[2], arr[3]));
        System.out.print("\narr[2] / arr[3] = " + Calculator.divide(arr[2], arr[3]));
        System.out.print("\narr[2] - arr[3] = " + Calculator.subtraction(arr[2], arr[3]));
    }
}
