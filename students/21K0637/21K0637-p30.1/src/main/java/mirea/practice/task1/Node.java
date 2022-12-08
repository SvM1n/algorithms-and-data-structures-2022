package mirea.practice.task1;

public class Node {
    private final int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.right = null;
        this.left = null;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int height() {
        if (right == null && left == null) {
            return 1;
        }
        assert this.right != null;
        return Math.max(this.right.height(), this.left.height()) + 1;
    }

    public void reverse() {
        Node tmp = this.right;

        this.right = this.left;
        this.left = tmp;
        this.left.reverse();
        this.right.reverse();
    }

    public int lookup(int target) {
        if (right == null && left == null) {
            return 0;
        }
        if (target == value) {
            return 1;
        }
        if (target > value) {
            assert right != null;
            return right.lookup(target);
        } else {
            return left.lookup(target);
        }
    }

    public int getWidth(int level) {
        if (this.right == null && this.left == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return this.left.getWidth(level - 1) + this.right.getWidth(level - 1);
        }
        return 0;
    }

    public int getMaxWidth() {
        int maxWidth = 0;
        int width = 0;
        int height = height();
        for (int i = 0; i < height; i++) {
            width = getWidth(i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    public int size() {
        if (this.left == null && this.right == null) {
            return 0;
        } else {
            return this.right.size() + this.left.size() + 1;
        }
    }

    boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.value == b.value
                && sameTree(a.left, b.left)
                && sameTree(a.right, b.right);
        } else {
            return false;
        }
    }
}
