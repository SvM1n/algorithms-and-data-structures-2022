package ru.mirea.practice.program9;

import java.util.Scanner;

abstract class Poker {
    public static void main(String[] args) {
        String[] deck = {"2ч", "3ч", "4ч", "5ч", "6ч", "7ч", "8ч", "9ч", "10ч", "Вч", "Дч", "Кч", "Тч",
                         "2б", "3б", "4б", "5б", "6б", "7б", "8б", "9б", "10б", "Вб", "Дб", "Кб", "Тб",
                         "2п", "3п", "4п", "5п", "6п", "7п", "8п", "9п", "10п", "Вп", "Дп", "Кп", "Тп",
                         "2к", "3к", "4к", "5к", "6к", "7к", "8к", "9к", "10к", "Вк", "Дк", "Кк", "Тк"};
        int temp = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of players:");
            int n = sc.nextInt();
            int[] usedDeck = new int[52];
            int max = 51;
            if (n > 10) {
                System.out.println("Error too much players");
            } else {
                int index = 0;
                for (int i = 0; i < n; i++) {
                    for (int k = 0; k < 5; k++) {
                        boolean work = true;
                        temp = (int) (Math.random() * max);
                        while (work) {
                            int counter = 0;
                            for (int j = 0; j < 52; j++) {
                                if (usedDeck[j] == temp) {
                                    temp = (int) (Math.random() * max);
                                    break;
                                } else {
                                    counter++;
                                }
                            }
                            if (counter == 52) {
                                work = false;
                            }
                        }
                        System.out.print(deck[temp] + " ");
                        usedDeck[index] = temp;
                        index++;
                    }
                    System.out.println("\n");
                }
            }
        }

    }
}
