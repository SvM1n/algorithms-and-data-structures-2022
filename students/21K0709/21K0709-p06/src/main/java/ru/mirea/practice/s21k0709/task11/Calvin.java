package ru.mirea.practice.s21k0709.task11;

public class Calvin implements Convertable {
    static final double celsiusToCalvin = 273.15;

    @Override
    public double convert(double temperature, String system) {
        if ("Celsius".equals(system)) {
            return temperature - celsiusToCalvin;
        }
        if ("Calvin".equals(system)) {
            return temperature + celsiusToCalvin;
        }
        System.out.println("Неправильный ввод!");
        return 0.0;
    }
}
