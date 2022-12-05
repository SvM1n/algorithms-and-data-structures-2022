package ru.mirea.practice.task3;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String housing;
    private final String flat;

    public Address(String parseString) {
        String[] s = new String[7];
        StringTokenizer st = new StringTokenizer(parseString);
        int i = 0;
        while (st.hasMoreTokens()) {
            s[i++] = st.nextToken();
        }

        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address{"
            + "country='" + country + '\''
            + ", region='" + region + '\''
            + ", city='" + city + '\''
            + ", street='" + street + '\''
            + ", house='" + house + '\''
            + ", housing='" + housing + '\''
            + ", flat='" + flat + '\''
            + '}';
    }
}
