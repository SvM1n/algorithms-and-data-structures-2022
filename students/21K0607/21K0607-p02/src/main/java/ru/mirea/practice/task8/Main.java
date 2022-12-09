package ru.mirea.practice.task8;

public abstract class Main {

    public static void main(String[] args) {
        String[] array = new String[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
        }
        for (String string : array) {
            System.out.print(string + " ");
        }
        for (int j = 0; j <= (array.length) / 2; j++) {
            String temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
        }
        System.out.println("");
        for (String string : array) {
            System.out.print(string + " ");
        }
    }
}
