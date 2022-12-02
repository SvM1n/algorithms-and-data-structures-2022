package ru.mirea.practice.task7;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println(PasswordChecker.check("fdkrkij"));
        System.out.println(PasswordChecker.check("Frhjekergn_0"));
        System.out.println(PasswordChecker.check("rhjekergn_0"));
        System.out.println(PasswordChecker.check("Frhjekergn_"));
        System.out.println(PasswordChecker.check("Frhjekergn1"));
    }
}
