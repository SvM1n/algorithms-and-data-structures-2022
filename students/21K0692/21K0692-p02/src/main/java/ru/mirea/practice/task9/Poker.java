package EX9;

import java.lang.System;
import java.util.*;
import java.util.Scanner;

public class Poker {

    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            String[] Cards = new String[]{"2 clubs", "2 diamonds", "2 hearts", "2 spades",
                    "3 clubs", "3 diamonds", "3 hearts", "3 spades",
                    "4 clubs", "4 diamonds", "4 hearts", "4 spades",
                    "5 clubs", "5 diamonds", "5 hearts", "5 spades",
                    "6 clubs", "6 diamonds", "6 hearts", "6 spades",
                    "7 clubs", "7 diamonds", "7 hearts", "7 spades",
                    "8 clubs", "8 diamonds", "8 hearts", "8 spades",
                    "9 clubs", "9 diamonds", "9 hearts", "9 spades",
                    "10 clubs", "10 diamonds", "10 hearts", "10 spades",
                    "Jack clubs", "Jack diamonds", "Jack hearts", "Jack spades",
                    "Queen clubs", "Queen diamonds", "Queen hearts", "Queen spades",
                    "King clubs", "King diamonds", "King hearts", "King spades",
                    "Ace clubs", "Ace diamonds", "Ace hearts", "Ace spades"};
            //Collections.shuffle(Arrays.asList(Cards));
            String[] used = new String[52];
            for (int i = 0; i < num; i++) {
                for (int k = 0; k < 5; k++) {
                    int n = (int) (Math.random() * (51) + 0);
                    if (!(Arrays.asList(used).contains(Cards[n]))) {
                        used[i + k] = Cards[n];
                        System.out.print(used[i + k]);
                    }

                }
                System.out.print('\n');
            }
        }
    }
}
