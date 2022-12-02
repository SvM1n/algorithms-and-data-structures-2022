package ru.mirea.workseven.task6;

import ru.mirea.workseven.task5.MorphString;

public class ProcessStrings implements MorphString {
    @Override
    public int charValue(String string) {
        return string.length();
    }

    @Override
    public String oddString(String string) {
        String oddString = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i += 2) {
            oddString += chars[i];
        }
        return oddString;
    }

    @Override
    public String invertString(String string) {
        String invString = "";
        char[] chars = string.toCharArray();
        for (int i = string.length() - 1; i >= 0; i--) {
            invString += chars[i];
        }
        return invString;
    }
}
