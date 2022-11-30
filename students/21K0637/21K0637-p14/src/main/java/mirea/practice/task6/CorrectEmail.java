package mirea.practice.task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CorrectEmail {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String expression = scanner.nextLine();
            Pattern pattern = Pattern.compile("([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.?([a-zA-Z]{2,5}?)");
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println("Correct email " + matcher.group());
            }
        }
    }
}
