package ru.mirea.practice.solutiontask7;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String tocheck = sc.nextLine();
            Pattern password = Pattern.compile("(?=.+[a-z])(?=.+[A-Z]+)(?=.+[0-9])\\w{7,}");
            if (password.matcher(tocheck).matches()) {
                System.out.println(tocheck);
            }
        }
    }
}
