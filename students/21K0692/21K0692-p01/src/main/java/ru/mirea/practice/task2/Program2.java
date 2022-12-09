package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class Program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Scanner sc = new Scanner(System.in);
            int array[];
            int n = sc.nextInt();
            array = new int[n];
            int i = 0, maxi = -999999999, mini = 999999999;
            float a = 0;
            while(i < n){
                array[i] = sc.nextInt();
                a+=array[i];
                if(array[i] < mini){
                    mini = array[i];
                }
                if(array[i] > maxi){
                    maxi = array[i];
                }
                i++;
            }
            System.out.print("Sum: ");
            System.out.println(a);
            System.out.print("SR: ");
            System.out.println(a/n);
            i = 0;
            a = 0;
            do{
                a+=array[i];
                i++;
            }while(i < n);
            System.out.print("Sum: ");
            System.out.println(a);
            System.out.print("SR: ");
            System.out.println(a/n);
            System.out.print("Min: ");
            System.out.println(mini);
            System.out.print("Max: ");
            System.out.println(maxi);
        }
    }
}
