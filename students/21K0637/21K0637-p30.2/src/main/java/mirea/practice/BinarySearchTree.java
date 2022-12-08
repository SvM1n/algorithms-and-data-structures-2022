package mirea.practice;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    private static Node getMinimumKey(Node ptr) {
        while (ptr.left != null) {
            ptr = ptr.left;
        }
        return ptr;
    }

    public static Node getMaximumKey(Node ptr) {
        while (ptr.right != null) {
            ptr = ptr.right;
        }
        return ptr;
    }

    public Node deleteNode(int key) {
        Node parent = null;
        Node curr = root;
        while (curr != null && curr.value != key) {
            parent = curr;
            if (key < curr.value) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr == null) {
            return root;
        }
        if (curr.left == null && curr.right == null) {
            if (!curr.equals(root)) {
                if (parent.left.equals(curr)) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null;
            }
        } else if (curr.left != null && curr.right != null) {
            Node successor = getMinimumKey(curr.left);
            int val = successor.value;
            deleteNode(successor.value);
            curr.value = val;
        } else {
            Node child = (curr.left != null) ? curr.left : curr.right;
            if (!curr.equals(root)) {
                if (curr.equals(parent.left)) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            } else {
                root = child;
            }
        }
        return root;
    }

    public int getMinimum() {
        return getMinimumKey(root).value;
    }

    public int getMaximum() {
        return getMaximumKey(root).value;
    }

    public int binSearch(int item) {
        Node searchNode = root;
        for (; ; ) {
            if (searchNode == null) {
                return 0;
            } else if (item == searchNode.value) {
                return 1;
            } else if (item > searchNode.value) {
                searchNode = searchNode.right;
            } else {
                searchNode = searchNode.left;
            }
        }
    }

    public void insert(int x) {
        Node parent = null;
        Node node = root;
        while (node != null) {
            parent = node;
            if (x < node.value) {
                node = node.left;
            } else if (x > node.value) {
                node = node.right;
            } else {
                return;
            }
        }
        Node newNode = new Node(x);
        if (parent == null) {
            root = newNode;
        } else if (x < parent.value) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public void print(Node searchNode) {
        if (searchNode == null) {
            return;
        }
        print(searchNode.left);
        print(searchNode.right);
        System.out.printf("[%d]\n", searchNode.value);
    }

    public void print() {
        print(this.root);
    }

    public void destroy(Node searchNode) {
        if (searchNode == null) {
            return;
        }
        destroy(searchNode.left);
        destroy(searchNode.right);
        searchNode = null;
    }

    public void destroy() {
        destroy(this.root);
    }


    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}


