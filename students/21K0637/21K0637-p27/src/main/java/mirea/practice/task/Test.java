package mirea.practice.task;

public abstract class Test {
    public static void main(String[] args) {
        HashTab<String, Integer> hashTab = new HashTab<>();

        hashTab.hashtabAdd("a", 1);
        hashTab.hashtabAdd("b", 2);
        hashTab.hashtabAdd("c", 3);
        hashTab.hashtabAdd("d", 4);
        hashTab.hashtabAdd("e", 5);
        hashTab.hashtabAdd("f", 6);
        hashTab.hashtabAdd("g", 7);
        hashTab.hashtabAdd("h", 8);
        hashTab.hashtabAdd("i", 9);
        hashTab.hashtabAdd("j", 10);

        System.out.println(hashTab);

        hashTab.hashtabDelete("g");
        System.out.println(hashTab);
    }
}
