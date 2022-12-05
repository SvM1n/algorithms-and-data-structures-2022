package ru.mirea.practice3.randomtasks.task3;

abstract class FourNumbers {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        int[] randmas = new int[4];
        for (int i = 0; i < randmas.length; i++) {
            randmas[i] = rnd(10, 99);
        }
        for (int i : randmas) {
            System.out.print(i + " ");
        }
        boolean flag = true;
        for (int i = 0; i < randmas.length; i++) {
            if (randmas[i] > randmas[i + 1]) {
                System.out.println("Not sorted");
                flag = false;
                break;
            } else if (!flag) {
                System.out.println("Sorted");
            }
        }

    }
}
