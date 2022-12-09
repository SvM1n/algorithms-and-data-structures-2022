package ru.mirea.practice.task1;

//1. Трамвайные билеты имеют шестизначные номера, считается,
// что билет – счастливый,
// если сумма первых трех цифр совпадает с суммой последних трех. Найдите количество всех счастливых билетов.


public abstract class Main {
    public static void main(String[] args) {
        System.out.println(isLucky("721550"));
    }

    public static boolean isLucky(String str) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Integer.valueOf(str.charAt(i) - '0');

            sum -= Integer.valueOf(str.charAt(str.length() - 1 - i) - '0');
        }

        return sum == 0;
    }


}
