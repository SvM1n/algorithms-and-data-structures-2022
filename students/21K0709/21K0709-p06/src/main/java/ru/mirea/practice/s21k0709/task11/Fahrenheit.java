package ru.mirea.practice.s21k0709.task11;

public class Fahrenheit implements Convertable {
    static final double celsiusToFahrenheit = 32;

    @Override
    public double convert(double temperature, String system) {
        if ("Celsius".equals(system)) {
            return (temperature - celsiusToFahrenheit) * 5 / 9;
        }
        if ("Fahrenheit".equals(system)) {
            return temperature * 9 / 5 + celsiusToFahrenheit;
        }
        System.out.println("Неправильный ввод!");
        return 0.0;
    }
}
