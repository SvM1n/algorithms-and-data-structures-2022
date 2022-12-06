package ru.mirea.practice.task1;

import java.io.IOException;

public abstract class Main {
    public static void main(String[] args) throws IOException {
        Tree<Integer> tree = new Tree<>();
        tree.add(2);
        tree.add(4);
        tree.add(-1);
        tree.add(-12);
        tree.add(-10);
        tree.add(-11);
        tree.add(-122);
        tree.add(-1211);
        tree.add(20);
        tree.add(11);
        tree.add(12);
        System.out.println(tree.height(tree));
        tree.printTree();
        tree.reverse(tree);
        System.out.println("\n______After Reverse________\n");
        tree.printTree();
    }
}
