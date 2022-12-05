package ru.mirea.practice.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        int n = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введмте количество игроков: ");
            n = sc.nextInt();
        }

        Card[] stock = new Card[Card.SUITS_AMOUNT * Card.VALUES_AMOUNT];
        List<Integer> availableCards = new ArrayList<>(Card.SUITS_AMOUNT * Card.VALUES_AMOUNT);

        for (int suit = 0; suit < Card.SUITS_AMOUNT; ++suit) {
            for (int val = 0; val < Card.VALUES_AMOUNT; ++val) {
                stock[suit * Card.VALUES_AMOUNT + val] = new Card(val + 1, suit);
            }
        }

        for (int i = 0; i < Card.SUITS_AMOUNT * Card.VALUES_AMOUNT; ++i) {
            availableCards.add(i);
        }

        //for (int i = 0; i < stock.length; ++i) {
        //  System.out.println(stock[i]);
        //}
        Random rand = new Random();

        JUMP_OUT:
        for (int players = 0; players < n; ++players) {
            for (int cards = 0; cards < 5; ++cards) {
                Card nextCard;
                int idx;
                if (!availableCards.isEmpty()) {
                    idx = rand.nextInt(availableCards.size());
                    nextCard = stock[availableCards.get(idx)];
                } else {
                    break JUMP_OUT;
                }
                System.out.println(nextCard);
                availableCards.remove(idx);
            }
            System.out.println("\n");
        }
        System.out.println("Карты разданы.");
    }
}
