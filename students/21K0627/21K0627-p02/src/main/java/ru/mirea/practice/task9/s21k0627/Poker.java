package ru.mirea.practice.task9.s21k0627;

import java.util.Random;
import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        int players = 0;
        int cardsForPlayer = 5;
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "Валет", "Дама", "Король", "Туз"};
        String[] suits = {"Пики", "Буби", "Черви", "Крести"};
        int amountOfCards = suits.length * numbers.length;
        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println("Введите кол-во игроков");
                if (sc.hasNextInt()) {
                    players = sc.nextInt();
                }
            } while (players < 0 || cardsForPlayer * players > (amountOfCards));

            // инициализация колоды
            String[] deck = new String[amountOfCards];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length * i + j] = numbers[i] + " " + suits[j];
                }
            }

            int rand = amountOfCards - 1;
            Random random = new Random();

            // тасовка колоды
            for (int i = 0; i < amountOfCards; i++) {
                int j = random.nextInt(rand + 1);
                String temp = deck[j];
                deck[j] = deck[i];
                deck[i] = temp;
            }

            System.out.println("Карты, которые получили игроки:");
            for (int i = 0; i < cardsForPlayer * players; i++) {
                if (i % 5 == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(deck[i] + "; ");
            }
        }
    }
}
