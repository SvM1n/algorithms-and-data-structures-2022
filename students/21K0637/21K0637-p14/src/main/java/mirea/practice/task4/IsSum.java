package mirea.practice.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class IsSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String expression = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\d+\\+");
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println("Выражение прошло проверку");
            } else {
                System.out.println("ошибка в выражении");
            }
        }
    }
}
