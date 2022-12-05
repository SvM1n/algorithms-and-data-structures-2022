package ru.mirea.practice.task8;

public abstract class Palindrome {
    public static boolean recursion(String string) {
        char first;
        char last;
        int size = string.length();
        String subString;
        if (size <= 1) {
            return true;
        } else {
            first = string.toCharArray()[0];
            last = string.toCharArray()[size - 1];
            subString = string.substring(1, size - 1);
            return first == last && recursion(subString);
        }
    }

    public static void main(String[] args) {
        if (recursion("казак")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
