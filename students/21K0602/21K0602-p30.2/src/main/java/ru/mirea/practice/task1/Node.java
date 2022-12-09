package ru.mirea.practice.task1;

import java.io.IOException;

public class Node<T extends Comparable<T>> {
    Node<T> parent;
    Node<T> left;
    Node<T> right;
    T value;

    public Node(Node<T> parent) {
        this.parent = parent;
    }

    public void add(T value, Node<T> parent) {
        if (this.value == null) {
            this.value = value;
        } else {
            if (this.value.compareTo(value) > 0) {
                if (left == null) {
                    left = new Node<>(parent);
                }
                left.add(value, left);
            } else {
                if (right == null) {
                    right = new Node<>(parent);
                }
                right.add(value, right);
            }

        }
    }

    public void printTree() throws IOException {
        if (right != null) {
            right.printTree(true, "");
        }
        printNodeValue();
        if (left != null) {
            left.printTree(false, "");
        }
    }

    private void printTree(boolean isRight, String indent) throws IOException {
        if (right != null) {
            right.printTree(true, indent + (isRight ? "        " : " |      "));
        }
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("----- ");
        printNodeValue();
        if (left != null) {
            left.printTree(false, indent + (isRight ? " |      " : "        "));
        }
    }

    private void printNodeValue() throws IOException {
        if (value == null) {
            System.out.print("<null>");
        } else {
            System.out.print(value.toString());
        }
        System.out.print('\n');
    }


}
