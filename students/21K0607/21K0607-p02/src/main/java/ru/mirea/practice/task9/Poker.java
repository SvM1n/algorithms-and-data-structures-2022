package ru.mirea.practice.task9;

import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        int cardInHand = 5;
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] order = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //Создать Колоду с модулем Рандом
        //При раздаче карт исключать выданные карты
        int amountOfCard = suit.length * order.length;
        String[] deck = new String[52];
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < order.length; j++) {
                deck[i * order.length + j] = suit[i] + " " + order[j];
            }
        }
        for (String card : deck) {
            System.out.print(card + " ");
        }
        for (int i = 0; i < deck.length; i++) {
            int rand = (int) (Math.random() * 1000000);
            if (rand >= amountOfCard) {
                int more = rand / amountOfCard;
                rand -= more * amountOfCard;
            }
            String temp = deck[rand];
            deck[rand] = deck[i];
            deck[i] = temp;
        }
        System.out.println();
        for (String card : deck) {
            System.out.print(card + " ");
        }
        System.out.println();
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number of players: ");
            int numberOfPlayers = in.nextInt();
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Player number " + (i + 1));
                for (int j = 0; j < cardInHand; j++) {
                    int rand = (int) (Math.random() * 1000000);
                    if (rand >= amountOfCard) {
                        int more = rand / amountOfCard;
                        rand -= more * amountOfCard;
                    }
                    System.out.print(deck[rand] + " ");
                    deck[rand] = null;
                    for (int k = rand + 1; k < amountOfCard; k++) {
                        deck[k - 1] = deck[k];
                        deck[k] = null;
                    }
                    amountOfCard -= 1;
                }
                System.out.println();
            }
            for (String card : deck) {
                System.out.print(card + " ");
            }
        }
    }

}
