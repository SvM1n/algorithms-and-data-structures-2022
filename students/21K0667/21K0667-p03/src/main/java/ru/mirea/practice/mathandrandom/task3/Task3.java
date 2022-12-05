package ru.mirea.practice.mathandrandom.task3;

abstract class Task3 {
    public static void main(String[] args) {
        int n = 4;
        int[] dig = new int[n];
        for (int i = 0; i < n; i++) {
            dig[i] = (int) (Math.random() * 90 + 10);
            System.out.println(dig[i]);
        }
        for (int i = 0; i < n; i++) {
            if (dig[i] > dig[i + 1]) {
                System.out.println("Not increasing");
                System.exit(0);
            }
        }
        System.out.println("Increasing");
    }
}
