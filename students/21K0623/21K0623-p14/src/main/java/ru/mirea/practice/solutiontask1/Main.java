package ru.mirea.practice.solutiontask1;

import java.util.Scanner;
import java.util.StringTokenizer;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String toParse = sc.nextLine();
            StringTokenizer st = new StringTokenizer(toParse,";,. ");
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        }
    }
}
