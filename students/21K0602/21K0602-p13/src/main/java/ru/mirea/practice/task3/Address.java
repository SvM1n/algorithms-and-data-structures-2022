package ru.mirea.practice.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String flat;


    public Address(String address) {
        StringTokenizer stringTokenizer = new StringTokenizer(address, ".,;");
        String[] temp = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            temp[i++] = stringTokenizer.nextToken();
        }
        if (temp.length < 6) {
            throw new IllegalArgumentException("Мало данных для адресса");
        }
        country = temp[0].replace(" ", "");
        city = temp[1].replace(" ", "");
        street = temp[2].replace(" ", "");
        house = temp[3].replace(" ", "");
        housing = temp[4].replace(" ", "");
        flat = temp[5].replace(" ", "");

    }

    public String getCountry() {
        return country;
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



    public String getHousing() {
        return housing;
    }

    public String getFlat() {
        return flat;
    }

    public String getAddress() {
        return country + " " + city + " " + street + " " + house + " " + housing + " " + flat;
    }

    @Override
    public String toString() {
        return "Address{" + "country='" + country + '\'' + ", city='" + city + '\'' + ", street='" + street + '\''
                + ", house='" + house + '\'' + ", housing='" + housing + '\'' + ", flat='" + flat + '\'' + '}';
    }
}

