package com.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;

public class IntArraySortService {

    public void insertionSort(IntArray intArray) {
        for (int i = 1; i < intArray.getLength(); i++) {
            int current = intArray.getElement(i);
            int j = i - 1;
            while (j >= 0 && current < intArray.getElement(j)) {
                intArray.setElement(intArray.getElement(j), j + 1);
                j--;
            }
            intArray.setElement(current, j + 1);
        }
    }

    public void bubbleSort(IntArray intArray) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < intArray.getLength() - 1; i++) {
                if (intArray.getElement(i) > intArray.getElement(i + 1)) {
                    temp = intArray.getElement(i + 1);
                    intArray.setElement(intArray.getElement(i), i + 1);
                    intArray.setElement(temp, i);
                    sorted = false;
                }
            }
        }
    }

    public void selectionSort(IntArray intArray) {
        for (int i = 0; i < intArray.getLength(); i++) {
            int min = intArray.getElement(i);
            int idMin = i;
            for (int j = i + 1; j < intArray.getLength(); j++) {
                if (intArray.getElement(j) < min) {
                    min = intArray.getElement(j);
                    idMin = j;
                }
            }
            int temp = intArray.getElement(i);
            intArray.setElement(min, i);
            intArray.setElement(temp, idMin);
        }
    }

    public void reverse(IntArray intArray) {
        int length = intArray.getLength();
        for (int i = 0; i < length / 2; i++) {
            int temp = intArray.getElement(length - 1 - i);
            intArray.setElement(intArray.getElement(i), length - 1 - i);
            intArray.setElement(temp, i);
        }
    }
}
