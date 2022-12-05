package ru.mirea.practice.task9;

import java.util.Scanner;
import java.util.Random;

public abstract class Poker {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of players from 2 to 10 \n");
            n = sc.nextInt();
        }
        String[] suits = {"Peak", "Tambourine", "Heart", "Clubs"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9",
                         "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];


        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i * rank.length + j] = "/" + rank[j] + ": " + suits[i] + "/";
            }
        }

        Random rnd = new Random();
        for (int i = 0; i < deck.length; i++) {
            int index = rnd.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Cards for " + i + 1 + "nd player: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck[i * 5 + j] + " ");
            }
            System.out.print("\n");
        }
    }
}
