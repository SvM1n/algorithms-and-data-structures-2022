package DZ_3;

import java.util.Arrays;

public class Chisl {
    public void main(String[] args) {
        double[] arr = new double[4];
        double[] arr1 = new double[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Math.random() * (100) + 10;
        }
        System.arraycopy(arr, 0, arr1, 0, 4);
        Arrays.sort(arr1);
        if (Arrays.equals(arr, arr1)) {
            System.out.print("YES");
        }
    }

}
