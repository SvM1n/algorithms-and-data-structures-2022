package DZ_4;

import java.util.Scanner;

public class Numb {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            n = sc.nextInt();
        }
        double[] arr = new double[n];
        double[] arr1 = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * (n) - 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr1[i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]);
        }
    }
}
