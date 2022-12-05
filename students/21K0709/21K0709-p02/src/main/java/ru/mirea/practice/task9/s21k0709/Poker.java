package ru.mirea.practice.task9.s21k0709;

import java.util.Random;
import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        int players = 0;
        int cardspl = 5;
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "Валет", "Дама", "Король", "Туз"};
        String[] masti = {"Пики", "Буби", "Черви", "Крести"};
        int colcards = masti.length * numbers.length;
        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println("Введите кол-во игроков");
                if (sc.hasNextInt()) {
                    players = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (players < 0 || cardspl * players > (colcards));

            String[] deck = new String[colcards]; // инициализируем колоду
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < masti.length; j++) {
                    deck[masti.length * i + j] = numbers[i] + " " + masti[j];
                }
            }
            for (int i = 0; i < deck.length; i++) {
                if (i % 4 == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(deck[i] + "| ");
            }
            System.out.println();
            System.out.println();
            int rand = colcards - 1;
            Random random = new Random();

            for (int i = 0; i < colcards; i++) {
                int t = random.nextInt(rand + 1); // 0 по умолчанию, rand не включ (генерир ранд число от [0,rand)
                String tempvar = deck[t];
                deck[t] = deck[i];
                deck[i] = tempvar;
            }
            System.out.println("Вывод перетасованных карт:");
            for (int i = 0; i < deck.length; i++) {
                if (i % 4 == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(deck[i] + "| ");
            }
            //выводим перетасованную колоду
            System.out.println();
            System.out.println("Вывод перетасованных карт которые получили игроки:");
            for (int i = 0; i < cardspl * players; i++) {
                if (i % 5 == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(deck[i] + "| ");
            }
        }
    }
}
