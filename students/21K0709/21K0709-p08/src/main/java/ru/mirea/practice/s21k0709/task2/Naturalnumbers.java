package ru.mirea.practice.s21k0709.task2;

//3. Задание от A до B
//        Даны два целых числа A и В (каждое в отдельной строке). Выведите все
//        числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
//        убывания в противном случае.

public abstract class Naturalnumbers {
    public static int numbers(int a, int b) {
        if (a < b) {
            if (a == b) {
                System.out.println(b);
                return b;
            }
            System.out.println(a);
            return numbers(a + 1,b);
        } else {
            if (b == a) {
                System.out.println(a);
                return a;
            }
            System.out.println(b);
            return numbers(b + 1,a);
        }
    }
}
