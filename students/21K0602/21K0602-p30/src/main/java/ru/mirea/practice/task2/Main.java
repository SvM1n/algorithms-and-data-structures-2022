package ru.mirea.practice.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
            + "ut labore et dolore magna aliqua.";
        Huffman huffman = new Huffman();
        Map<Character, Integer> frequencies = huffman.charsFrequency(text);
        List<Tree> treeNodes = new ArrayList<>();
        for (Character c : frequencies.keySet()) {
            treeNodes.add(new Tree(frequencies.get(c), c));
        }

        Tree tree = huffman.humanAlgorithm(treeNodes);

        Map<Character, String> codes = new TreeMap<>();
        for (Character c : frequencies.keySet()) {
            codes.put(c, tree.getCodeForCharacter(c, ""));
        }

        System.out.println(codes.toString());

        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encoded.append(codes.get(text.charAt(i)));
        }

        System.out.println("text before encoding: " + text + "\nafter: " + encoded.toString());
    }
}
