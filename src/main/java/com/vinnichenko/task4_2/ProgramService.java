package com.vinnichenko.task4_2;

import com.vinnichenko.task4_1.exception.ProgramException;

public class ProgramService {

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }

    public void sortArray(int[][] array, Method method) throws ProgramException {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (compare(array[i], array[i + 1], method)) {
                    int[] tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    sorted = false;
                }
            }
        }
    }


    public void reverse(int[][] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int[] temp = array[length - 1 - i];
            array[length - 1 - i] = array[i];
            array[i] = temp;
        }
    }

    public boolean compare(int[] array1, int[] array2, Method method) throws ProgramException {
        boolean result;
        switch (method) {
            case SUM:
                result = sum(array1) > sum(array2);
                break;
            case MIN:
                result = min(array1) > min(array2);
                break;
            case MAX:
                result = max(array1) > max(array2);
                break;
            default:
                throw new ProgramException("Unexpected value: " + method);
        }
        return result;
    }
}
