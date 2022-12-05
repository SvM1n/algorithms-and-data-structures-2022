package ru.mirea.practice.solutiontask5;

public final class Main {
    private Main() {}

    public static String changeNum(String num) {
        String lastfour = num.substring(num.length() - 4);
        String threenum = num.substring(num.length() - 7, num.length() - 4);
        String secthreenum = num.substring(num.length() - 10, num.length() - 7);
        String first;
        if (num.contains("+")) {
            first = num.substring(1, num.length() - 10);
        } else {
            first = num.substring(0, num.length() - 10);
        }
        return "+" + first + "-" + secthreenum + "-" + threenum + "-" + lastfour;
    }

    public static void main(String[] args) {
        System.out.println(changeNum("+104289652211"));
        System.out.println(changeNum("+79175655655"));
        System.out.println(changeNum("89175655655"));
    }
}
