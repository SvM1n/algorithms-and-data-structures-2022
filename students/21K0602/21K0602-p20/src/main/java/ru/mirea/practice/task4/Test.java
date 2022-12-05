package ru.mirea.practice.task4;

public abstract class Test {
    public static void main(String[] args) {
        MinMax<Integer> minMax = new MinMax<>(new Integer[] {2,1,4,6,1});
        System.out.println(minMax.getMin());
        System.out.println(minMax.getMax());

        System.out.println("Calculator test");
        System.out.println(Calculator.substraction(2,4));
        System.out.println(Calculator.multiply(2,4));
        System.out.println(Calculator.sum(2,4));
        System.out.println(Calculator.divide(2,4));
    }
}
