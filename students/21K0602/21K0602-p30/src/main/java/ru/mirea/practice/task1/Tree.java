package ru.mirea.practice.task1;

import java.io.IOException;

public class Tree<T extends Comparable> {

    private Tree<T> left;
    private Tree<T> right;
    private T value;


    public Tree<T> getLeft() {
        return left;
    }

    public void setLeft(Tree<T> left) {
        this.left = left;
    }

    public Tree<T> getRight() {
        return right;
    }

    public void setRight(Tree<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public void add(T value) {
        if (getValue() == null) {
            setValue(value);
        } else {
            if (getValue().compareTo(value) >= 0) {
                if (getLeft() == null) {
                    setLeft(new Tree<>());
                }
                getLeft().add(value);
            } else {
                if (getRight() == null) {
                    setRight(new Tree<>());
                }
                getRight().add(value);
            }

        }
    }

    public int height(Tree<T> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.left), height(node.right));
        }

    }

    public int size(Tree<T> node) {

        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    int getMaxWidth(Tree<T> node) {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;

        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
    }

    int getWidth(Tree<T> node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
        }
        return 0;
    }


    public int lookUp(Tree<T> node, T targetValue) {

        if (node == null) {
            return 0;
        } else {
            if (value.equals(targetValue)) {
                return 1;
            } else {
                if (targetValue.compareTo(value) > 0) {
                    return lookUp(node.right, targetValue);
                } else {
                    return lookUp(node.left, targetValue);
                }
            }
        }

    }


    public void reverse(final Tree<T> root) {
        if (root == null) {
            return;
        }
        final Tree temp = root.right;
        root.right = root.left;
        root.left = temp;
        reverse(root.left);
        reverse(root.right);
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

    public boolean sameTree(Tree<T> tree1, Tree<T> tree2) {
        if (tree1 == null && tree2 == null) {
            return false;
        } else if (tree1 != null && tree2 != null) {
            return tree1.value.equals(tree2.value) && sameTree(tree1.left, tree2.left)
                && sameTree(tree1.left, tree2.left);
        } else {
            return false;
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