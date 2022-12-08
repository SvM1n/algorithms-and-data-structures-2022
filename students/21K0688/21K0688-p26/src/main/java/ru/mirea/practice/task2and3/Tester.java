package ru.mirea.practice.task2and3;

public abstract class Tester {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        try {
            myList.add(10);
            myList.add(13);
            myList.add(10);
            myList.add(45);
            myList.add(12);
            myList.print();
            System.out.println("next() for 4th element of list: " + myList.iterator(4).next());
            myList.remove(10);
            System.out.println("-----------------------------------------------------------------------");
            myList.print();
        } catch (RuntimeException e) {
            System.err.print(e);
        }
    }
}
