package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[][] roadMap = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    roadMap[i][j] = in.nextInt();
                }
            }
            System.out.println(getRoadCount(roadMap));
        }

    }


    public static int getRoadCount(int[][] roadMap) {
        int count = 0;
        for (int i = 0; i < roadMap.length; i++) {
            for (int j = 0; j < roadMap.length; j++) {
                if (roadMap[i][j] == 1 && roadMap[j][i] == 1) {

                    roadMap[i][j] = 0;
                    roadMap[j][i] = 0;
                    count++;
                }
            }
        }
        return count;
    }


}
