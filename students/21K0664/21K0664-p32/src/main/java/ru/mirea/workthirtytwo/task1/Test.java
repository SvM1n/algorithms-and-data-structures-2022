package ru.mirea.workthirtytwo.task1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class Test {

    private static List<Integer> arr;
    private static List<Boolean> b;
    private static int max = 0;
    private static int pos = 0;

    public static void johnsonTrotter(int num) {

        generateArrL(num);
        printArrL(arr, b);
        int i = 1;
        while (i < factorial(num)) {
            System.out.println("Pass Number " + (i + 1));

            calculateMobile(num);
            if (!b.get(pos) && pos != 0) {
                int temp;

                temp = arr.get(pos - 1);
                arr.set(pos - 1, arr.get(pos));
                arr.set(pos, temp);

                boolean c = b.get(pos - 1);
                b.set(pos - 1, b.get(pos));
                b.set(pos, c);

            } else if (b.get(pos) && pos < num - 1) {
                int temp;

                temp = arr.get(pos + 1);
                arr.set(pos + 1, arr.get(pos));
                arr.set(pos, temp);

                boolean c = b.get(pos + 1);
                b.set(pos + 1, b.get(pos));
                b.set(pos, c);

            }
            for (int a = 0; a < num; a++) {
                if (max < arr.get(a)) {
                    if (!b.get(a)) {
                        b.set(a, true);
                    } else if (b.get(a)) {
                        b.set(a, false);
                    }
                }
            }
            printArrL(arr, b);
            i++;
        }

    }

    public static void calculateMobile(int num) {
        max = 0;

        for (int i = 0; i < num; i++) {

            int mobile = 0;
            if (b.get(i) && i < num - 1 && arr.get(i) > arr.get(i + 1)) {
                mobile = arr.get(i);

                if (mobile > max) {
                    max = mobile;
                    pos = arr.indexOf(max);
                }
            } else if (!b.get(i) && i > 0 && arr.get(i) > arr.get(i - 1)) {
                mobile = arr.get(i);

                if (mobile > max) {
                    max = mobile;
                    pos = arr.indexOf(max);
                }
            }
        }
    }

    public static void generateArrL(int num) {
        arr = new ArrayList<Integer>();
        b = new ArrayList<Boolean>();
        for (int i = 0; i < num; i++) {
            arr.add(i + 1);
            b.add(false);
        }
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void printArrL(List<Integer> arr, List<Boolean> arro) {
        System.out.print("                ");
        for (boolean arrow : arro) {
            if (arrow) {
                System.out.print(">");
            } else if (!arrow) {
                System.out.print("<");
            }
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("                ");
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Please enter a number: ");
            int userInt = in.nextInt();

            johnsonTrotter(userInt);

        } catch (InputMismatchException e) {
            in.next();
        } finally {
            in.close();
        }

    }
}