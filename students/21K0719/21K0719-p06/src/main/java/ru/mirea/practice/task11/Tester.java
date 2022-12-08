package ru.mirea.practice.task11;

public abstract class Tester {
    public static void main(String[] args) {
        Kelvin kelvin = new Kelvin();
        System.out.print("40℃ = " + kelvin.convert(40) + "K");
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println("\n40℃ = " + fahrenheit.convert(40) + "℉");
    }
}
