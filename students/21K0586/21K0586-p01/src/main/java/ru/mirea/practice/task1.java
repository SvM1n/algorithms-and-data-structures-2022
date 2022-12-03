package ru.mirea.practice;

import java.util.Scanner;

public class task1 {
 public static void main(String[] args) {
     int n;
     int s = 0;
     Scanner c = new Scanner(System.in);
     System.out.println("Input quantity of array's numbers");
     n = c.nextInt();
     int array[] = new int[n];//создание массива
     System.out.println("Input array:");
     for (int i = 0; i < n; i++) {
         array[i] = c.nextInt();
         s += array[i];
     }
     System.out.println("Sum = " + s);
     System.out.println("average = " + (float) s / n);
 }
 }
