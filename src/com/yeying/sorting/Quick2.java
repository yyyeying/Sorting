package com.yeying.sorting;

import java.util.Arrays;

public class Quick2 implements Sort {
    static int[] array;

    public static int[] sort(int[] array) {
        Quick2.array = array;
        partition(0, array.length - 1);
        return array;
    }

    private static void partition(int low, int high) {
        if (low < high) {
            int base = array[low];
            int lowPtr = low;
            int hiPtr = high+1;
            while (true) {
                while (lowPtr++ <= high) {
                    if (array[lowPtr] >= base) {
                        break;
                    }
                }
                while (hiPtr-- > low) {
                    if (array[hiPtr] <= base) {
                        break;
                    }
                }
                if (lowPtr < hiPtr) {
                    swap(lowPtr, hiPtr);
                } else {
                    break;
                }
            }
            swap(low, hiPtr);
            partition(low, hiPtr - 1);
            partition(hiPtr + 1, high);
        }
    }

    private static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] result = Quick2.sort(new int[]{5, 4, 1, 6, 3, 2, 1});
        System.out.println(Arrays.toString(result));
    }

}
