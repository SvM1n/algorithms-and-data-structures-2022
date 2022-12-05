package ru.mirea.practice.solutiontask2;

public final class TwoZero {
    private TwoZero() {}
    //10

    public static int twoZero(String string) {
        if (string.charAt(0) == '0' && string.charAt(1) == '0') {
            return 0;
        }
        if (string.charAt(0) == '1') {
            return 1 + twoZero(string.substring(1));
        }
        return twoZero(string.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(twoZero("01010111100111"));
    }
}
