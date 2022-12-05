package ru.mirea.practice.task5;

public class Number {
    private String code;
    private String number;


    public Number(String numberToFormat) {
        number = "";
        StringBuilder stringBuilder = new StringBuilder(number);
        if (numberToFormat.startsWith("8")) {
            code = "+7";
        } else {
            code = numberToFormat.substring(0, numberToFormat.length() - 10);
        }
        String operator = numberToFormat.substring(numberToFormat.length() - 10, numberToFormat.length() - 7);
        String threeNumbers = numberToFormat.substring(numberToFormat.length() - 7, numberToFormat.length() - 4);
        String fourNumbers = numberToFormat.substring(numberToFormat.length() - 4);
        stringBuilder.append(code);
        stringBuilder.append(" (");
        stringBuilder.append(operator);
        stringBuilder.append(")-");
        stringBuilder.append(threeNumbers);
        stringBuilder.append("-");
        stringBuilder.append(fourNumbers);
        number = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Number{" + "number='" + number + '\'' + '}';
    }
}
