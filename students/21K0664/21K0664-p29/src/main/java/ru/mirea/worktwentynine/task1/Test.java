package ru.mirea.worktwentynine.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {

            int n = in.nextInt();
            int ans = 0;

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    ans += in.nextInt();
                }
            }
            ans /= 2;

            System.out.println(ans);

        } catch (InputMismatchException e) {
            in.nextInt();
        } finally {
            in.close();
        }

    }

}

