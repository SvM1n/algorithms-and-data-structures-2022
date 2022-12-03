package ru.mirea.practice;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int n;
        int s = 0;
        Scanner c = new Scanner(System.in);
        System.out.println("Input quantity of array's numbers");
        n = c.nextInt();
        int array[] = new int[n];//создание массива
        System.out.println("Input array:");
        for (int i=1;i<=10;i++){
            String str= String.format("%.2f",(double)1/i);
            System.out.print(str+" ");
        }
        System.out.println("");
        double t = factorial(5);
        System.out.println(t);
    }
    public static double factorial(double n){
        double s=1;
        while (n>0){
            s*=n;
            n--;
        }
        n=s;
        return s;
    }
}
