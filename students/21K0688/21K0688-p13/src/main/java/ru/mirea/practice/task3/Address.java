package ru.mirea.practice.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String flat;

    public void subAddressToken(String address) {
        StringTokenizer stringTokenizer = new StringTokenizer(address, ".,;");
        String[] temp = new String[stringTokenizer.countTokens()];
        for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
            temp[i] = stringTokenizer.nextToken();
        }
        country = temp[0].replace(" ", "");
        region = temp[1].replace(" ", "");
        city = temp[2].replace(" ", "");
        street = temp[3].replace(" ", "");
        house = temp[4].replace(" ", "");
        flat = temp[5].replace(" ", "");
    }

    public void subAddressSplit(String address) {
        String[] temp = address.split(",");
        country = temp[0].replace(" ", "");
        region = temp[1].replace(" ", "");
        city = temp[2].replace(" ", "");
        street = temp[3].replace(" ", "");
        house = temp[4].replace(" ", "");
        flat = temp[5].replace(" ", "");
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "Address{"
                + "country='" + country + '\''
                + ", region='" + region + '\''
                + ", city='" + city + '\''
                + ", street='" + street + '\''
                + ", house='" + house + '\''
                + ", flat='" + flat + '\''
                + '}';
    }
}
