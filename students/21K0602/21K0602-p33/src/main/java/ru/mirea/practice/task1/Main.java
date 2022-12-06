package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        LoopList<Integer> list1 = new LoopList<>();
        list1.add(12);
        list1.add(22);
        list1.add(13);
        list1.add(52);
        list1.print();
        LoopList<Integer> list2 = new LoopList<>();
        while (!list1.isEmpty()) {
            list2.add(list1.removeFirst());
        }
        list1.print();
        list2.print();
    }
}
