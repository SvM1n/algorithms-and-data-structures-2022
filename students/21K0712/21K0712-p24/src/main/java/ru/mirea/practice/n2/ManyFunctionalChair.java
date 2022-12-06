package ru.mirea.practice.n2;

public class ManyFunctionalChair implements Chair {

    public int sum(int a, int b) {

        return a + b;
    }

    @Override
    public void getMaterial() {

        System.out.println("Plastic");
    }

}
