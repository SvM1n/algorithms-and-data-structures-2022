package ru.mirea.practice.s21k0647.punkt56;

public class ProcessString implements WorkString {
    String str;

    ProcessString(String str) {
        this.str = str;
    }

    @Override
    public int lenStr() {
        return str.length();
    }

    @Override
    public String oddStr() {
        String newStr = new String();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    @Override
    public String inversionStr() {
        StringBuilder nStr = new StringBuilder(str);
        for (int i = 0; i < str.length() / 2; i++) {
            char x = nStr.charAt(i);
            nStr.setCharAt(i, nStr.charAt(str.length() - 1 - i));
            nStr.setCharAt(nStr.length() - 1 - i, x);

        }
        return nStr.toString();
    }
}
