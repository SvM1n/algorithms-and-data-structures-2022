package ru.mirea.practice.task2;


public class Tree implements Comparable<Tree> {

    int weight;
    Character content;
    Tree left;
    Tree right;

    public Tree(int weight, Character content) {
        this.weight = weight;
        this.content = content;
    }

    public Tree(int weight, Character content, Tree left, Tree right) {
        this.weight = weight;
        this.content = content;
        this.left = left;
        this.right = right;
    }


    @Override
    public int compareTo(Tree o) {
        return o.weight - weight;
    }

    //обход дерева в глубину. Для всех листов которые нам не нужны будет возвращено значение null
    // и только для нужного вернется код. ( Рекурсивный обход)
    public String getCodeForCharacter(Character c, String parentPath) {
        if (content != null && content.equals(c)) {
            return parentPath;
        } else {
            if (left != null) {
                String path = left.getCodeForCharacter(c, parentPath + 0);
                if (path != null) {
                    return path;
                }
            }
            if (right != null) {
                String path = right.getCodeForCharacter(c, parentPath + 1);
                if (path != null) {
                    return path;
                }
            }
        }
        return null;
    }


}

