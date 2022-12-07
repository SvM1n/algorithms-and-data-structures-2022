package ru.mirea.practice.task8;

abstract class StringSwap {



    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g"};
        for (int i = 0; i < (array.length / 2); i++) {
            String temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        for (String str : array) {
            System.out.print(str + "\t");
        }
    }
}
