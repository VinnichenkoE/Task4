package com.vinnichenko.task4_2.service;

import com.vinnichenko.task4_1.exception.ProgramException;

import java.util.Comparator;

public class JaggedArrayService {

    public void sortArray(int[][] array, Comparator<int[]> comparator,
                          boolean reverse) throws ProgramException {
        if (array == null || comparator == null) {
            throw new ProgramException("incorrect parameters");
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    int[] tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    sorted = false;
                }
            }
        }
        if (reverse) {
            reverse(array);
        }
    }

    public void reverse(int[][] array) throws ProgramException {
        if (array == null) {
            throw new ProgramException("incorrect parameter");
        }
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int[] temp = array[length - 1 - i];
            array[length - 1 - i] = array[i];
            array[i] = temp;
        }
    }
}
