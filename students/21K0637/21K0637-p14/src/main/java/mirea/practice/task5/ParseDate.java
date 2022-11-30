package mirea.practice.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ParseDate {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String expression = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/[1-2][0,9]\\d{2}");
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println("Найденa датa: " + matcher.group());
            }
        }
    }
}
