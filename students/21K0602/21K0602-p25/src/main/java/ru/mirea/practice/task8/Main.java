package ru.mirea.practice.task8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {

    public static Object[] filter(Object[] objects, Filter filter) {

        int count = 0; //считает сколько элементов не удовлетворяет условию фильтра
        for (int i = 0; i < objects.length; i++) {
            if (filter.apply(objects[i])) {
                objects[i - count] = objects[i];//сдвигает элемент влево
                // на текущее количество эелементов не проходящих фильтр
            } else {
                count++;
            }
        }
        return Arrays.copyOf(objects, objects.length - count);
    }

    public static void main(String[] args) {
        String[] strings = {"29/02/2001", "31/12/1999", null, "29/02/2000"};
        String[] filteredStrings = (String[]) filter(strings, new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o == null) {
                    return false;
                }
                Pattern pattern = Pattern.compile("[1-3]\\d\\/((1[0-2])|(0[1-9]))\\/((19\\d{2})|([2-9]\\d{3}))");

                Matcher matcher = pattern.matcher(o.toString());
                if (matcher.find()) {
                    String[] strings = o.toString().split("/");
                    if (Integer.parseInt(strings[0]) == 29 && Integer.parseInt(strings[1]) == 2
                            && Integer.parseInt(strings[2]) % 400 != 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(filteredStrings));
    }

}
