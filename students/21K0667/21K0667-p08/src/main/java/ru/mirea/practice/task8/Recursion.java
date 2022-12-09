package ru.mirea.practice.task8;

public abstract class Recursion {
    public static String solve(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                if (s.length() == 2) {
                    return "YES";
                }
                return solve(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}
