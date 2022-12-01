package ru.mirea.practice.task5;

public class Number1 {
    private String code;
    private String number;

    public Number1(String strNumber) {
        number = "";
        StringBuilder stringBuilder = new StringBuilder(number);
        if (strNumber.startsWith("8")) {
            code = "+7";
        } else {
            code = strNumber.substring(0, strNumber.length() - 10);
        }
        String three1 = strNumber.substring(strNumber.length() - 10, strNumber.length() - 7);
        String three2 = strNumber.substring(strNumber.length() - 7, strNumber.length() - 4);
        String four = strNumber.substring(strNumber.length() - 4);
        stringBuilder.append(code);
        stringBuilder.append(three1);
        stringBuilder.append("-");
        stringBuilder.append(three2);
        stringBuilder.append("-");
        stringBuilder.append(four);
        number = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return number;
    }
}
