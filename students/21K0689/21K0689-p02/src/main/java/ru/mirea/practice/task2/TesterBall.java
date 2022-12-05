package ru.mirea.practice.task2;

import java.util.Scanner;

public final class TesterBall {
    private TesterBall() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Ball redBall = new Ball(0.0, 0.0);
            System.out.println("X, Y coordinates: " + redBall.getX() + "\t" + redBall.getY());
            System.out.println("Enter new X, Y coordinates: ");
            redBall.setX(scan.nextDouble());
            redBall.setY(scan.nextDouble());
            redBall.move(redBall.getX(), redBall.getY());
            System.out.println(redBall);
        } finally {
            scan.close();
        }

    }

}