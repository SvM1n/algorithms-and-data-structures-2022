package ru.mirea.practice.task2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Huffman {

    public Map<Character, Integer> charsFrequency(String str) {
        Map<Character, Integer> characterIntegerMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            Integer count = characterIntegerMap.get(c);
            characterIntegerMap.put(c, count != null ? count + 1 : 1);
        }
        return characterIntegerMap;
    }


    public Tree humanAlgorithm(List<Tree> treeNodes) {

        while (treeNodes.size() > 1) {
            Collections.sort(treeNodes);
            Tree left = treeNodes.remove(treeNodes.size() - 1);
            Tree right = treeNodes.remove(treeNodes.size() - 1);

            Tree parent = new Tree(right.weight + left.weight, null, left, right);
            treeNodes.add(parent);
        }
        return treeNodes.get(0);

    }
}
