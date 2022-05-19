package com.yeying.sorting;

public class Quick implements Sort {
    public int[] sort(int[] array) {
        partition(array, 0, array.length - 1);
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void partition(int[] array, int start, int end) {
        //System.out.println("start: " + start + "\tend: " + end);
        if (start < end) {
            int base = array[start];
            int lptr = start + 1;
            int hptr = end;
            while (true) {
                //System.out.println("array[" + lptr + "] = " + array[lptr] + "\tarray[" + hptr + "] = " + array[hptr]);
                while (lptr < end && array[lptr] <= base) {
                    //System.out.println("array[" + lptr + "] = " + array[lptr] + "\tbase = " + base);
                    lptr++;
                }
                while (hptr > start && array[hptr] >= base) {
                    //System.out.println("array[" + hptr + "] = " + array[hptr] + "\tbase = " + base);
                    hptr--;
                }
                if (lptr < hptr) {
                    swap(array, lptr, hptr);
                } else {
                    break;
                }
            }
            swap(array, hptr, start);
            /*
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
             */
            partition(array, start, hptr - 1);
            partition(array, hptr + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{89, -1, 34, 4, 2, 7, 3, 7, 8, 3, 7, 83, 54, 8};
        Quick q = new Quick();
        int[] sortedArray = q.sort(array);
        for (int x : sortedArray) {
            System.out.print(x + "\t");
        }
    }
}
