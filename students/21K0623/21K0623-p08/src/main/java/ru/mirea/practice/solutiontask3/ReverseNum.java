package ru.mirea.practice.solutiontask3;

public final class ReverseNum {
    private ReverseNum() {}
    //11

    public static int reverseNum(int num) {
        if (num % 10 == 0) {
            return num;
        }
        return num % 10 * (int) Math.pow(10, (int) Math.log10(num)) + reverseNum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(5421));
    }
}
