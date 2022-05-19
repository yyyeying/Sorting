package com.yeying.sorting;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Bubble implements Sort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 7, 3, 7, 8, 3, 7, 83, 54, 8};
        Bubble b = new Bubble();
        int[] sortedArray = b.sort(array);
        for (int x : sortedArray) {
            System.out.print(x + "\t");
        }
    }
}
