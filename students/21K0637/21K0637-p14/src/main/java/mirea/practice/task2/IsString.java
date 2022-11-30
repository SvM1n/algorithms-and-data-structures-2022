package mirea.practice.task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class IsString {
    public static void main(String[] args) {
        String rightString = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(rightString);
        try (Scanner scanner = new Scanner(System.in)) {
            String toParse = scanner.nextLine();
            System.out.println(pattern.matcher(toParse).matches());
        }
    }
}
