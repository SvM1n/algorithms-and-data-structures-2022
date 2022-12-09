package ru.mirea.practice.task1;

/* Создайте массив из 4 случайных целых чисел из отрезка [10;99],
 выведите его на экран в строку, далее определите и выведите на экран сообщение
 о том, является ли массив строго возрастающей последовательностью. */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class Task1 {

    private Task1() {
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            integerList.add(ThreadLocalRandom.current().nextInt(10, 100));
        }

        System.out.println(integerList);

        boolean isAscending = true;
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i).compareTo(integerList.get(i - 1)) <= 0) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("This array is a strictly ascending sequence");
        } else {
            System.out.println("This array is not a strictly ascending sequence");
        }
    }
}
