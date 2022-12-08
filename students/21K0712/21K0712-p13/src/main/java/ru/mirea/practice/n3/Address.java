package ru.mirea.practice.n3;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartment;

    public Address(String str) {
        String[] s = str.split(", ");
        this.country = s[0];
        this.region = s[1];
        this.city = s[2];
        this.street = s[3];
        this.house = s[4];
        this.housing = s[5];
        this.apartment = s[6];
    }

    @Override
    public String toString() {
        return "Address{"
                +
                "country='" + country + '\''
                +
                ", region='" + region + '\''
                +
                ", city='" + city + '\''
                +
                ", street='" + street + '\''
                +
                ", house='" + house + '\''
                +
                ", housing='" + housing + '\''
                +
                ", apartment='" + apartment + '\''
                +
                '}';
    }
}
