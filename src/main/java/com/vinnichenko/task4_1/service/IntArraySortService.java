package com.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;

public class IntArraySortService {

    public void insertionSort(IntArray intArray) throws ProgramException {
        if (intArray == null || intArray.getLength() < 2) {
            throw new ProgramException("IntArray is incorrect");
        }
        for (int i = 1; i < intArray.getLength(); i++) {
            int current = intArray.getElement(i).getAsInt();
            int j = i - 1;
            while (j >= 0 && current < intArray.getElement(j).getAsInt()) {
                intArray.setElement(intArray.getElement(j).getAsInt(), j + 1);
                j--;
            }
            intArray.setElement(current, j + 1);
        }
    }

    public void bubbleSort(IntArray intArray) throws ProgramException {
        if (intArray == null || intArray.getLength() < 2) {
            throw new ProgramException("IntArray is incorrect");
        }
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < intArray.getLength() - 1; i++) {
                if (intArray.getElement(i).getAsInt() > intArray.getElement(i + 1).getAsInt()) {
                    temp = intArray.getElement(i + 1).getAsInt();
                    intArray.setElement(intArray.getElement(i).getAsInt(), i + 1);
                    intArray.setElement(temp, i);
                    sorted = false;
                }
            }
        }
    }

    public void selectionSort(IntArray intArray) throws ProgramException {
        if (intArray == null || intArray.getLength() < 2) {
            throw new ProgramException("IntArray is incorrect");
        }
        for (int i = 0; i < intArray.getLength(); i++) {
            int min = intArray.getElement(i).getAsInt();
            int idMin = i;
            for (int j = i + 1; j < intArray.getLength(); j++) {
                if (intArray.getElement(j).getAsInt() < min) {
                    min = intArray.getElement(j).getAsInt();
                    idMin = j;
                }
            }
            int temp = intArray.getElement(i).getAsInt();
            intArray.setElement(min, i);
            intArray.setElement(temp, idMin);
        }
    }
}
