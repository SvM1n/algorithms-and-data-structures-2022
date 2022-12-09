package ru.mirea.practice.task1;


import java.io.IOException;

public class Tree<T extends Comparable<T>> {

    Node<T> rootNode;

    public Tree() {
        rootNode = new Node<>(null);
    }

    public Node<T> getLeft() {
        return rootNode.left;
    }

    public void setLeft(Node<T> left) {
        rootNode.left = left;
    }

    public Node<T> getRight() {
        return rootNode.right;
    }

    public void setRight(Node<T> right) {
        rootNode.right = right;
    }

    public T getValue() {
        return rootNode.value;
    }

    public void setValue(T value) {
        rootNode.value = value;
    }


    public void add(T value) {
        rootNode.add(value, rootNode);
    }

    public boolean remove(T value, Node<T> node) {

        if (value.compareTo(node.value) < 0) {
            return remove(value, node.left);
        } else if (value.compareTo(node.value) > 0) {
            return remove(value, node.right);
        } else {
            if (node.left == null && node.right == null) {
                if (node.parent.left != null && node.parent.left.value == node.value) {
                    node.parent.left = null;
                } else if (node.parent.right != null && node.parent.right.value == node.value) {
                    node.parent.right = null;
                }
            } else if (node.left != null && node.right == null) {
                if (node.parent.left != null && node.parent.left.value == node.value) {
                    node.parent.left = node.left;
                }

            } else if (node.right != null && node.left == null) {
                if (node.parent.right != null && node.parent.right.value == node.value) {
                    node.parent.right = node.right;
                }

            } else {
                Node<T> minNode = minValue(node.right);
                remove(minNode.value, rootNode);
                node.value = minNode.value;

            }
        }
        return true;

    }

    private Node<T> minValue(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    public void clear() {
        rootNode = null;
    }

    public int height(Node<T> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public int size(Node<T> node) {

        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    int getMaxWidth(Node<T> node) {
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

    int getWidth(Node<T> node, int level) {
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

    public void print() throws IOException {
        rootNode.printTree();
    }

    public int lookUp(Node<T> node, T targetValue) {

        if (node == null) {
            return 0;
        } else {
            if (rootNode.value.equals(targetValue)) {
                return 1;
            } else {
                if (targetValue.compareTo(rootNode.value) > 0) {
                    return lookUp(node.right, targetValue);
                } else {
                    return lookUp(node.left, targetValue);
                }
            }
        }

    }


    public void reverse(final Node<T> root) {
        if (root == null) {
            return;
        }
        final Node<T> temp = root.right;
        rootNode.right = root.left;
        rootNode.left = temp;
        reverse(root.left);
        reverse(root.right);
    }


    public boolean sameTree(Node<T> tree1, Node<T> tree2) {
        if (tree1 == null && tree2 == null) {
            return false;
        } else if (tree1 != null && tree2 != null) {
            return tree1.value.equals(tree2.value) && sameTree(tree1.left, tree2.left)
                    && sameTree(tree1.left, tree2.left);
        } else {
            return false;
        }
    }


}