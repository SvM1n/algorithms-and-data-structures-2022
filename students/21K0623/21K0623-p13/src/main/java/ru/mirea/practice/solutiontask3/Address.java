package ru.mirea.practice.solutiontask3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String home;
    private String housing;
    private String flat;

    public void setSplit(String string) {
        String[] temp = string.split(", ");
        country = temp[0];
        region = temp[1];
        city = temp[2];
        street = temp[3];
        home = temp[4];
        housing = temp[5];
        flat = temp[6];
    }

    public void setToken(String string) {
        String[] temp = new String[7];
        StringTokenizer tokenizer = new StringTokenizer(string,",.;");
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            temp[i] = tokenizer.nextToken();
            i++;
        }
        country = temp[0];
        region = temp[1];
        city = temp[2];
        street = temp[3];
        home = temp[4];
        housing = temp[5];
        flat = temp[6];
    }

    @Override
    public String toString() {
        return country + "\n" + region + "\n" + city + "\n" + street
                + "\n" + home + "\n" + housing + "\n" + flat;
    }
}
