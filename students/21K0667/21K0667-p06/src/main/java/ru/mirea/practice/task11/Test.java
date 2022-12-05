package ru.mirea.practice.task11;

public abstract class Test {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println("0℃ = " + fahrenheit.convert(0) + "F");
        Kelvin kelvin = new Kelvin();
        System.out.print("0℃ = " + kelvin.convert(0) + "K");
    }
}