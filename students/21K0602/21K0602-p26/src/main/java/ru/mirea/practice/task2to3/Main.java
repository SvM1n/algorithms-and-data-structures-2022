package ru.mirea.practice.task2to3;

public abstract class Main {
    public static void main(String[] args) {
        UserList<Integer> list = new UserList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.remove(2);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.clear();

        System.out.println(list.size());
    }
}
