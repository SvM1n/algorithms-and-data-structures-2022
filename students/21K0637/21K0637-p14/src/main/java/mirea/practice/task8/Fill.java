package mirea.practice.task8;

import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class Fill {
    public static Object[] filter(Object[] array, Filter filter) {
        ArrayList<Object> resultArray = new ArrayList<>();
        for (Object o : array) {
            if (filter.apply(o)) {
                resultArray.add(o);
            }
        }
        return resultArray.toArray();
    }

    public static void main(String[] args) {
        String[] inputStringArray = new String[]{"java19", "MIREA", "1313"};
        Object[] outputStringArray = filter(inputStringArray,
            o -> o instanceof String && Pattern.matches("\\b([a-zA-Z]+)\\b", (String) o));

        for (Object word: outputStringArray) {
            System.out.println(word);
        }
    }
}
