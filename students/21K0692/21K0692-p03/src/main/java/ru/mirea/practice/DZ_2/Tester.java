package DZ_2;

import java.lang.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tester {

    public static void main(String[] args) {
        try (Scanner source = new Scanner(System.in)) {
            int n = source.nextInt();
            Circle[] c1 = new Circle[n];
            Point[] p1 = new Point[n];
            double[] radius = new double[n];
            for (int i = 0; i < n; i++) {
                c1[i].setx(ThreadLocalRandom.current().nextDouble());
                c1[i].sety(ThreadLocalRandom.current().nextDouble());
                p1[i].setx0(ThreadLocalRandom.current().nextDouble());
                p1[i].sety0(ThreadLocalRandom.current().nextDouble());
                c1[i].setp(p1[i]);
                radius[i] = c1[i].circle(c1[i]);
            }
            double minim = 100000;
            double maxim = 0;
            for (int i = 0; i < n; i++) {
                if (minim < radius[i]) {
                    minim = radius[i];
                }
                if (maxim > radius[i]) {
                    maxim = radius[i];
                }
            }
            System.out.print(minim + " " + maxim);
        }
    }

}

