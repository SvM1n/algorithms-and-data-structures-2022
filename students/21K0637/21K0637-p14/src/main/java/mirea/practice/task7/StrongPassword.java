package mirea.practice.task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StrongPassword {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String expression = scanner.nextLine();
            Pattern pattern = Pattern.compile("([a-zA-Z0-9_\\-\\.]+){8,}");
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println("Correct password: " + matcher.group());
            }
        }
    }
}
