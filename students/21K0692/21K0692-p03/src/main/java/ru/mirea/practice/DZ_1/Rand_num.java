package DZ_1;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Rand_num {
    public void main(String[] args) {
        try (System.out.print("Random" + "\n")) {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double[] mas_rand = new double[n];
            for (int i = 0; i < n; i++) {
                mas_rand[i] = rand.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(mas_rand[i]);
            }

            System.out.print("\n" + "Random" + "\n");
            double[] mas_math_rand = new double[n];
            for (int i = 0; i < n; i++) {
                mas_math_rand[i] = Math.random();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(mas_math_rand[i]);
            }
        }
    }


}
