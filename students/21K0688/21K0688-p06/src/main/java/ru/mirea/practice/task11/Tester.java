package ru.mirea.practice.task11;

public abstract class Tester {
    public static void main(String[] args) {
        Kelvin kelvin = new Kelvin();
        System.out.print("30℃ = " + kelvin.convert(30) + "K");
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println("\n30℃ = " + fahrenheit.convert(30) + "℉");
    }
}
