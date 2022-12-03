package ru.mirea.practice;

public class task4 {
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
