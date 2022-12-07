package ru.mirea.practice.task1;

abstract class Program1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 13, 2, 6};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float avg = sum / 5f;
        System.out.print("Среднее арифметическое = ");
        System.out.println(avg);
    }
}
