package com.vinnichenko.task4_2.comparator;

import java.util.Comparator;

public class SumComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        if (sum(array1) > sum(array2)) {
            return 1;
        } else if (sum(array1) < sum(array2)) {
            return -1;
        }
        return 0;
    }
    public int sum(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }
}
