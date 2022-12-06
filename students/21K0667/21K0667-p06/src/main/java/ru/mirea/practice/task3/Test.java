package ru.mirea.practice.task3;

public abstract class Test {
    public static void main(String[] args) {
        Animal test1 = new Animal("Chicken");
        System.out.println(test1.getName());
        Human test2 = new Human("Mark");
        System.out.println(test2.getName());
    }

}
