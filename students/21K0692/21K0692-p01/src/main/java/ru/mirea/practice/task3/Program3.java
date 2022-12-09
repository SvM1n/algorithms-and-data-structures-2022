package ru.mirea.practice.task3;

abstract class Program3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int array[];
            int n = sc.nextInt();
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                System.out.println(array[i]);
            }
        }
    }
}
