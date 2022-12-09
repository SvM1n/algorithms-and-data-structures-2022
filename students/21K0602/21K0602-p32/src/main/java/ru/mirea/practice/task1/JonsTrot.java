package ru.mirea.practice.task1;

import java.util.Arrays;

public class JonsTrot {


    public void permutations(int n) {
        int[] permutation = new int[n];
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
            directions[i] = -1;
        }
        System.out.println(Arrays.toString(permutation));
        int mobileElementIndex = findMobileElement(permutation, directions);
        while (mobileElementIndex != -1) {
            int mobileElement = permutation[mobileElementIndex];
            int nextIndex = mobileElementIndex + directions[mobileElementIndex];
            swap(permutation, directions, mobileElementIndex, nextIndex);
            System.out.println(Arrays.toString(permutation));
            changeDirection(permutation, directions, mobileElement);
            mobileElementIndex = findMobileElement(permutation, directions);
        }

    }

    private void changeDirection(int[] permutation, int[] directions, int mobileElement) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileElement) {
                directions[i] = directions[i] * (-1);
            }
        }
    }

    private int findMobileElement(int[] permutationArray, int[] directions) {
        int index = -1;
        for (int i = 0; i < permutationArray.length; i++) {
            int nextElementIndex = i + directions[i];
            if (nextElementIndex >= 0 && nextElementIndex < permutationArray.length) {
                if (permutationArray[i] > permutationArray[nextElementIndex]) {
                    if (index == -1 || permutationArray[i] > permutationArray[index]) {
                        index = i;
                    }
                }
            }
        }
        return index;
    }

    public void swap(int[] permutation, int[] direction, int i, int j) {
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;

        int tempDir = direction[i];
        direction[i] = direction[j];
        direction[j] = tempDir;
    }

}


