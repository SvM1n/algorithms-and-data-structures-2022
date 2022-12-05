package ru.mirea.practice.solutiontask3;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] tocheck = sc.nextLine().split("; ");
            Pattern dollar = Pattern.compile("\\d+\\sUSD");
            Pattern euro = Pattern.compile("\\d+\\sEU");
            Pattern ruble = Pattern.compile("\\d+\\sRUB");
            for (String s : tocheck) {
                if (dollar.matcher(s).matches()
                        || euro.matcher(s).matches() || ruble.matcher(s).matches()) {
                    System.out.println(s);
                }
            }
        }
    }
}
