package ru.mirea.practice.n1to2;

abstract class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator("1 5 2 2 3 x 4 + / 1 - 7 / / /");
        calc.reading();
    }
}
