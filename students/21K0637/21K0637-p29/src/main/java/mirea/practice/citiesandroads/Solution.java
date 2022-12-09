package mirea.practice.citiesandroads;

import java.util.Scanner;

public abstract class Solution {
    public static void main(String[] args) {
        int n;
        int[][] roads;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            roads = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    roads[j][i] = sc.nextInt();
                }
            }
        }
        int roadsValue = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (roads[i][j] == 1) {
                    roadsValue++;
                }
            }
        }

        System.out.println(roadsValue);
    }
}
