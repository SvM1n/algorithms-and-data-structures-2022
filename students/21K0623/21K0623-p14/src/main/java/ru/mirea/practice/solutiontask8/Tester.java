package ru.mirea.practice.solutiontask8;

import java.util.Arrays;
import java.util.regex.Pattern;

public final class Tester {
    private Tester() {}

    public static Object[] filter(Object[] arr, Filter filter) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (filter.apply(arr[i])) {
                arr[i - count] = arr[i];
            } else {
                count++;
            }
        }
        return Arrays.copyOf(arr, arr.length - count);
    }

    public static void main(String[] args) {
        String[] temps = new String[]{"29/02/2000", " 30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};
        Object[] temp = filter(temps, o -> o instanceof String && Pattern.matches("^(([0-2][0-9])|(3[0-1]))/([0-1][0-2])"
                + "/((19\\d{2})|([2-9]\\d{3}))$", (String) o));
        for (Object toprint: temp) {
            System.out.println(toprint);
        }
    }
}
