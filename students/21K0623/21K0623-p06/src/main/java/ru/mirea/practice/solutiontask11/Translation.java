package ru.mirea.practice.solutiontask11;

public class Translation implements Convertible {

    @Override
    public void convert(double degrees, String name) {
        switch (name) {
            case "Celsius":
                System.out.println(degrees + " градусов по Цельсию");
                System.out.println((degrees * 1.8) - 459 + " градусов по Фаренгейту");
                System.out.println((degrees + 273) + " градусов по Кельвину");
                break;
            case "Kelvin":
                System.out.println(degrees + " градусов по Кельвину");
                System.out.println((degrees - 273) + " градусов по Цельсию");
                System.out.println((degrees * 1.8) - 459 + " градусов по Фаренгейту");
                break;
            case "Fahrenheit":
                System.out.println(degrees + " градусов по Фаренгейту");
                System.out.println(((degrees - 32) / 1.8) + " градусов по Цельсию");
                System.out.println(((degrees + 459) / 1.8) + " градусов по Кельвину");
                break;
            default:
                break;
        }
    }
}
