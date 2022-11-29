package ru.mirea.practice.solutiontask5;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String tocheck = sc.nextLine();
            Pattern time = Pattern.compile("^(([0-2][0-9])|(3[0-1]))/([0-1][0-2])/((19\\d{2})|([2-9]\\d{3}))$");
            if (time.matcher(tocheck).matches()) {
                System.out.println(tocheck);
            }
        }
    }
}
