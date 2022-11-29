package mirea.practice.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Client client = new Client(scanner.nextInt());
            System.out.println(client);
        } catch (BadInnException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
