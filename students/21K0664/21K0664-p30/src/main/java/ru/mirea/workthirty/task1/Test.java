package ru.mirea.workthirty.task1;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import java.util.List;

import java.util.Map;

import java.util.HashMap;

import java.util.Scanner;

import java.util.Iterator;

import java.util.InputMismatchException;



public abstract class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        try {


            List<String> input = new ArrayList<>();
            Map<String, Integer> frequency = new HashMap<>();
            Map<String, String> alphabet = new HashMap<>();

            String fileName;
            String line;

            System.out.print("Enter file: ");
            fileName = in.nextLine();
            System.out.println();
            in.close();


            in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                line = in.nextLine();
                input.add(line);
            }

            System.out.println(input.size());
            for (String cur : input) {
                for (int j = 0; j < cur.length(); j++) {
                    String currentChar = cur.substring(j, j + 1);
                    if (frequency.containsKey(currentChar)) {
                        frequency.replace(currentChar, frequency.get(currentChar) + 1);
                    } else {
                        frequency.put(currentChar, 1);
                    }
                }
            }

            System.out.println("Frequency map: ");
            for (Map.Entry<String, Integer> pair : frequency.entrySet()) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
            System.out.println("End of frequency map.");

            while (frequency.size() > 1) {
                String min1 = (String) frequency.keySet().toArray()[0];
                int val1 = frequency.get(min1);
                String min2 = (String) frequency.keySet().toArray()[1];
                int val2 = frequency.get(min2);
                if (frequency.size() > 2) {
                    Iterator iter = frequency.entrySet().iterator();
                    iter.next();
                    iter.next();
                    while (iter.hasNext()) {
                        Map.Entry pair = (Map.Entry) iter.next();
                        if (val1 > (int) pair.getValue()) {
                            if (val2 > val1) {
                                min2 = min1;
                                val2 = val1;
                            }
                            min1 = (String) pair.getKey();
                            val1 = (int) pair.getValue();
                        } else if (val2 > (int) pair.getValue()) {
                            min2 = (String) pair.getKey();
                            val2 = (int) pair.getValue();
                        }
                    }
                }

                System.out.println(min1 + ":" + min2);
                frequency.remove(min1);
                frequency.remove(min2);
                frequency.put(min1 + min2, val1 + val2);

                for (int i = 0; i < min1.length(); i++) {
                    String curChar = min1.substring(i, i + 1);
                    if (alphabet.containsKey(curChar)) {
                        alphabet.replace(curChar, "0" + alphabet.get(curChar).intern());
                    } else {
                        alphabet.put(curChar, "0");
                    }
                }

                for (int i = 0; i < min2.length(); i++) {
                    String curChar = min2.substring(i, i + 1);
                    if (alphabet.containsKey(curChar)) {
                        alphabet.replace(curChar, "1" + alphabet.get(curChar).intern());
                    } else {
                        alphabet.put(curChar, "1");
                    }
                }
            }

            System.out.println();
            for (Map.Entry<String, String> pair : alphabet.entrySet()) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }

            for (String curStr : input) {
                for (int j = 0; j < curStr.length(); j++) {
                    String curChar = curStr.substring(j, j + 1);
                    System.out.print(alphabet.get(curChar));
                }
            }

        } catch (InputMismatchException e) {
            in.next();
        } finally {
            in.close();
        }
    }
}