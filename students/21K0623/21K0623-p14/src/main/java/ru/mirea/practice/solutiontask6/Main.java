package ru.mirea.practice.solutiontask6;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String tocheck = sc.nextLine();
            Pattern email = Pattern.compile("^[a-z]+@(([a-z]+.(com|ru))|localhost)$");
            if (email.matcher(tocheck).matches()) {
                System.out.println(tocheck);
            }
        }
    }
}
