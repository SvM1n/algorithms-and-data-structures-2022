package ru.mirea.practice.s21k0647.zad11;

public class Temperature implements Convertable {
    double temperature;

    Temperature() {
        //pus
    }

    Temperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void convert(String s) {
        double t = 0;
        if ("F".equals(s)) {
            t = temperature * 33.8;
        } else if ("K".equals(s)) {
            t = temperature + 273;
        }
        System.out.println(t + " " + s);
    }

    @Override
    public String toString() {
        return "Температура " + temperature + " C";
    }
}
