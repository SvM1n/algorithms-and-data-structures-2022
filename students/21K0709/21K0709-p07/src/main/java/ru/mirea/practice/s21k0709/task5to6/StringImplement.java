package ru.mirea.practice.s21k0709.task5to6;

public class StringImplement implements ProcessStrings {
    private String str;

    public StringImplement(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int countChar() {
        return str.length();
    }

    @Override
    public String oddStr() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < str.length(); i += 2) {
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }

    @Override
    public String inverse() {
        return new StringBuffer(str).reverse().toString();
    }

    @Override
    public String toString() {
        return "StringImplement{"
                +
                "str='" + str + '\''
                +
                '}';
    }
}
