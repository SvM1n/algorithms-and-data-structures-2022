package ru.mirea.practice.solutiontask4;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String tocheck = sc.nextLine();
            Pattern math = Pattern.compile("\\d+\\s*\\+(\\s*|\\d+)");
            if (math.matcher(tocheck).find()) {
                System.out.println(tocheck);
            }
        }
    }
}
