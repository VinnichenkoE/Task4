package com.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;

public class IntArraySearchService {

    public int findNumber(IntArray sortedArray, int number) {
        int firstIndex = 0;
        int lastIndex = sortedArray.getLength() - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (sortedArray.getElement(middleIndex) == number) {
                return middleIndex;
            } else if (sortedArray.getElement(middleIndex) < number) {
                firstIndex = middleIndex + 1;
            } else if (sortedArray.getElement(middleIndex) > number) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public int minValue(IntArray array) {
        int min = array.getElement(0);
        for (int i = 1; i < array.getLength(); i++) {
            if (min > array.getElement(i)) {
                min = array.getElement(i);
            }
        }
        return min;
    }

    public int maxValue(IntArray array) {
        int max = array.getElement(0);
        for (int i = 1; i < array.getLength(); i++) {
            if (max < array.getElement(i)) {
                max = array.getElement(i);
            }
        }
        return max;
    }

    public IntArray simpleNumbers(IntArray array) {
        int count = 0;
        AuxiliaryService auxiliaryService = new AuxiliaryService();
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isSimple(array.getElement(i))) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isSimple(array.getElement(i))) {
                result[index] = array.getElement(i);
                index++;
            }
        }
        return new IntArray(result);
    }

    public IntArray fibonacciNumbers(IntArray array) {
        int count = 0;
        AuxiliaryService auxiliaryService = new AuxiliaryService();
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isFibonacci(array.getElement(i))) {
                count++;
            }
        }
        int[] fibonacciNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (auxiliaryService.isFibonacci(array.getElement(i))) {
                fibonacciNumbers[index] = array.getElement(i);
                index++;
            }
        }
        return new IntArray(fibonacciNumbers);
    }

    public IntArray numbersWithDifferentDigits(IntArray numbers) {
        int count = 0;
        for (int i = 0; i < numbers.getLength(); i++) {
            String number = Integer.toString(numbers.getElement(i));
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2] && chars[1] != chars[2]) {
                    count++;
                }
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.getLength(); i++) {
            String number = Integer.toString(numbers.getElement(i));
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2] && chars[1] != chars[2]) {
                    result[index] = numbers.getElement(i);
                    index++;
                }
            }
        }
        return new IntArray(result);
    }
}
