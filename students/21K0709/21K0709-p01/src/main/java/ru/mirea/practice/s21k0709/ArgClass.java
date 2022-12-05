package ru.mirea.practice.s21k0709;

//Третья задача 1 практической работы
public abstract class ArgClass {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
    }
}
