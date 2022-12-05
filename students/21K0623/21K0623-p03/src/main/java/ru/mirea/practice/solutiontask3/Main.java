package ru.mirea.practice.solutiontask3;

import java.util.Random;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        int[] mass = new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            mass[i] = rand.nextInt(89) + 10;
            System.out.print(mass[i] + " ");
        }
        boolean flag = false;
        for (int i = 1; i < 4; i++) {
            if (mass[i - 1] > mass[i]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println('\n' + "Не возрастающая");
        } else {
            System.out.println("Возрастающая");
        }
    }
}
