package ru.mirea.practice.task8;

public abstract class Polyandrous {

    public static String recursion(String word) {

        if (word.length() == 1) {
            return "YES";
        } else if (word.length() == 2 && word.charAt(0) == word.charAt(1)) {
            return "YES";
        } else {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return recursion(word.substring(1, word.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion("ghhg"));
    }
}
