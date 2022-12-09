package ru.mirea.practice.s21k0647.punkt56;

public final class Tester {
    private Tester() {
        //pust
    }

    public static void main(String[] args) {
        ProcessString s = new ProcessString("abcdefg");
        System.out.println(s.lenStr());
        System.out.println(s.oddStr());
        System.out.println(s.inversionStr());

    }
}
