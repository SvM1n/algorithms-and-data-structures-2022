package mirea.practice.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Splitter {
    public static void main(String[] args) {
        String toParse;
        try (Scanner scanner = new Scanner(System.in)) {
            toParse = scanner.nextLine();
        }
        StringTokenizer tokenizer = new StringTokenizer(toParse, ";");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
