package com.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;

public class IntArraySearchService {

    public int findNumber(IntArray sortedArray, int number)
            throws ProgramException {
        if (sortedArray == null || sortedArray.getLength() < 1) {
            throw new ProgramException("IntArray is incorrect");
        }
        int firstIndex = 0;
        int lastIndex = sortedArray.getLength() - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (sortedArray.getElement(middleIndex).getAsInt() == number) {
                return middleIndex;
            } else if (sortedArray.getElement(middleIndex).getAsInt() < number) {
                firstIndex = middleIndex + 1;
            } else if (sortedArray.getElement(middleIndex).getAsInt() > number) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public int minValue(IntArray array) throws ProgramException {
        if (array == null || array.getLength() < 2) {
            throw new ProgramException("IntArray is incorrect");
        }
        int min = array.getElement(0).getAsInt();
        for (int i = 1; i < array.getLength(); i++) {
            if (min > array.getElement(i).getAsInt()) {
                min = array.getElement(i).getAsInt();
            }
        }
        return min;
    }

    public int maxValue(IntArray array) throws ProgramException {
        if (array == null || array.getLength() < 2) {
            throw new ProgramException("IntArray is incorrect");
        }
        int max = array.getElement(0).getAsInt();
        for (int i = 1; i < array.getLength(); i++) {
            if (max < array.getElement(i).getAsInt()) {
                max = array.getElement(i).getAsInt();
            }
        }
        return max;
    }

    public IntArray simpleNumbers(IntArray array) throws ProgramException {
        if (array == null || array.getLength() < 1) {
            throw new ProgramException("IntArray is incorrect");
        }
        int count = 0;
        AuxiliaryService auxiliaryService = new AuxiliaryService();
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isSimple(array.getElement(i).getAsInt())) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isSimple(array.getElement(i).getAsInt())) {
                result[index] = array.getElement(i).getAsInt();
                index++;
            }
        }
        return new IntArray(result);
    }

    public IntArray fibonacciNumbers(IntArray array) throws ProgramException {
        if (array == null || array.getLength() < 1) {
            throw new ProgramException("IntArray is incorrect");
        }
        int count = 0;
        AuxiliaryService auxiliaryService = new AuxiliaryService();
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isFibonacci(array.getElement(i).getAsInt())) {
                count++;
            }
        }
        int[] fibonacciNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isFibonacci(array.getElement(i).getAsInt())) {
                fibonacciNumbers[index] = array.getElement(i).getAsInt();
                index++;
            }
        }
        return new IntArray(fibonacciNumbers);
    }

    public IntArray numbersWithDifferentDigits(IntArray array)
            throws ProgramException {
        if (array == null || array.getLength() < 1) {
            throw new ProgramException("IntArray is incorrect");
        }
        int count = 0;
        for (int i = 0; i < array.getLength(); i++) {
            String number = Integer.toString(array.getElement(i).getAsInt());
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2]
                        && chars[1] != chars[2]) {
                    count++;
                }
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            String number = Integer.toString(array.getElement(i).getAsInt());
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2]
                        && chars[1] != chars[2]) {
                    result[index] = array.getElement(i).getAsInt();
                    index++;
                }
            }
        }
        return new IntArray(result);
    }
}
