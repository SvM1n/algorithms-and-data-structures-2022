package mirea.practice.task4;

public abstract class Main {
    public static void main(String[] args) {
        MinMax<Double> minMax = new MinMax<>(new Double[] {45.5, 76.0, 12.0, 39.1, 24.7, 53.3, 89.8, 21.6, 62.9, 98.4});
        System.out.println("min is " + minMax.maxValue());
        System.out.println("max is " + minMax.minValue());
    }
}
