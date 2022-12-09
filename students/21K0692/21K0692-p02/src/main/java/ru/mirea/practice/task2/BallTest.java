package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball ();
        b1.setxy(2.4, 7);
        System.out.println (b1);
        b1.move(1,5);
        System.out.println (b1);
    }
}
