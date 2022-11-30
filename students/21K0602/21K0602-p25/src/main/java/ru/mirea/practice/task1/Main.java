package ru.mirea.practice.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Enter string to parse");
        try (Scanner in = new Scanner(System.in)) {
            StringTokenizer stringTokenizer = new StringTokenizer(in.nextLine(), ";,. ");
            String[] stringArgs = new String[stringTokenizer.countTokens()];
            for (int i = 0; i < stringArgs.length; i++) {
                if (stringTokenizer.hasMoreTokens()) {
                    stringArgs[i] = stringTokenizer.nextToken().replace(" ", "");
                }
                System.out.println(stringArgs[i]);
            }
        }
    }
}
