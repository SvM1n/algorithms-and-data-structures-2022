package ru.mirea.practice.task123;

public class Triangular {
    protected int a = 1;

    public void getFirstN(int n) {
        for (int i = 0; i < a; i++) {
            if (0 < n) {
                System.out.print(a + " ");
                n--;
            }

        }
        System.out.println();
        this.a++;
        if (n > 0) {
            getFirstN(n);
        } else {
            this.a = 1;
        }

    }
}
