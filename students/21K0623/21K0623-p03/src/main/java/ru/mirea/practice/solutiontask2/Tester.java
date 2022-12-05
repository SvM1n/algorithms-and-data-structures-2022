package ru.mirea.practice.solutiontask2;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    private final Circle[] mass;
    private final int sizeM;

    public Tester(int sizem, Circle[] mass) {
        this.sizeM = sizem;
        this.mass = mass;
    }

    public Circle searchSmaller() {
        if (this.sizeM == 1) {
            return this.mass[0];
        }
        double currentradius = this.mass[0].getR();
        Circle found = this.mass[0];
        for (int i = 1; i < this.sizeM; i++) {
            if (currentradius > this.mass[i].getR()) {
                currentradius = this.mass[i].getR();
                found = this.mass[i];
            }
        }
        return found;
    }

    public Circle searchBigger() {
        if (this.sizeM == 1) {
            return this.mass[0];
        }
        double currentradius = this.mass[0].getR();
        Circle found = this.mass[0];
        for (int i = 1; i < this.sizeM; i++) {
            if (currentradius < this.mass[i].getR()) {
                currentradius = this.mass[i].getR();
                found = this.mass[i];
            }
        }
        return found;
    }

    public void sortCircle() {
        for (int i = 0; i < this.sizeM - 1; i++) {
            for (int j = 0; j < this.sizeM - 1; j++) {
                if (this.mass[j].getR() > this.mass[j + 1].getR()) {
                    Circle temp = this.mass[j];
                    this.mass[j] = this.mass[j + 1];
                    this.mass[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder aboutmass = new StringBuilder();
        for (int i = 0; i < this.sizeM; i++) {
            aboutmass.append("------").append(i + 1).append("------\n")
                    .append(this.mass[i].toString()).append("\n-------------\n");
        }
        return aboutmass.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во окружностей в массиве");
            int temp = sc.nextInt();
            while (temp < 1) {
                System.out.println("Введите кол-во окружностей в массиве");
                temp = sc.nextInt();
            }
            Random rand = new Random();
            Circle[] mass = new Circle[temp];

            for (int i = 0; i < temp; i++) {
                Point temppoint = new Point(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
                Circle tempcircle = new Circle(temppoint, rand.nextInt(100) + 1);
                mass[i] = tempcircle;
            }
            Tester object = new Tester(temp, mass);
            System.out.println(object);

            System.out.println(object.searchBigger());
            System.out.println(object.searchSmaller());

            object.sortCircle();
            System.out.println(object);
        }
    }
}

