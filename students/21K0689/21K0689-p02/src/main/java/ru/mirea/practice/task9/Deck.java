package ru.mirea.practice.task9;


import java.util.ArrayList;

public class Deck {
    private String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private char[] suit = {'H', 'S', 'D', 'C'};
    String[] deck = new String[52];

    public Deck() {

        for (int i = 0; i < deck.length; ) {
            for (int j = 0; j < 13; ) {
                for (int k = 0; k < 4; ) {
                    deck[i] = value[j] + suit[k];
                    i++;
                    k++;
                }
                j++;
            }
        }
    }


    public void getDeck() {
        for (String s : deck) {
            System.out.print(s + "  ");
        }
        System.out.println();
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 51 + 1);
    }

    public void randdeck() {
        ArrayList<Object> array = new ArrayList<>();
        String temp;
        for (int i = 0; i < deck.length; i++) {
            int a = getRandomNumber();
            while (!array.contains(a)) {
                array.add(a);
            }
            temp = deck[i];
            deck[i] = deck[a];
            deck[a] = temp;

        }
    }


    public void getDealDeck(int n) {
        for (int i = 0; i < 5 * n; ) {
            for (int j = 0; j < 5; ) {

                System.out.print(deck[i] + "  ");
                j++;
                i++;
            }
            System.out.println("\n");
        }
    }
}
