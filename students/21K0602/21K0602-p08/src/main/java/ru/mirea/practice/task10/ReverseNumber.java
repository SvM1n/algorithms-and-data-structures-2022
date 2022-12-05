package ru.mirea.practice.task10;

public abstract class ReverseNumber {
    public static int recursion(int number, int reverseNumber) {
        if (number == 0) {
            return reverseNumber;
        } else {
            return recursion(number / 10, reverseNumber * 10 + number % 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(1234, 0));
    }
}
