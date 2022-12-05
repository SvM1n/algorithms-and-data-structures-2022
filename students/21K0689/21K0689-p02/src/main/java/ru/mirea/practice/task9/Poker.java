package ru.mirea.practice.task9;


import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Deck deck = new Deck();
            deck.getDeck();
            deck.randdeck();
            System.out.println();
            deck.getDeck();

            int n = sc.nextInt();
            if (n <= 10 && n > 0) {
                deck.getDealDeck(n);
            } else {
                System.out.println("Incorrect number of players");
            }
        } finally {
            sc.close();
        }
    }
}
