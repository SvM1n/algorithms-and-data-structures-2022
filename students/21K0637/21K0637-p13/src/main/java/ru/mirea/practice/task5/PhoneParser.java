package ru.mirea.practice.task5;

public class PhoneParser {
    private String country;
    private String city;
    private String triplet;
    private String quadruple;

    public PhoneParser(String parseString) {
        if (parseString.startsWith("8")) {
            this.country = "+7";
        } else {
            this.country = parseString.substring(0, parseString.length() - 10);
        }

        this.city = parseString.substring(parseString.length() - 10, parseString.length() - 7);
        this.triplet = parseString.substring(parseString.length() - 7, parseString.length() - 4);
        this.quadruple = parseString.substring(parseString.length() - 4);
    }

    @Override
    public String toString() {
        return country + "-" + city + "-" + triplet + "-" + quadruple;
    }
}

