package com.vinnichenko.task4.array.entity;

import com.vinnichenko.task4.array.service.Service;

public class IntArray {

    private int[] value;

    public IntArray(int[] value) {
        this.value = value;
    }

    public IntArray(String s) {
        String[] stringNumbers = s.trim().split("\\s+");
        int[] array = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            array[i] = Integer.parseInt(stringNumbers[i]);
        }
        this.value = array;
    }

    public int[] getValue() {
        return value;
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public int find(int[] sortedArray, int number) {
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (sortedArray[middleIndex] == number) {
                return middleIndex;
            } else if (sortedArray[middleIndex] < number) {
                firstIndex = middleIndex + 1;
            } else if (sortedArray[middleIndex] > number) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public int minValue(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }
        insertionSort(sortedArray);
        return sortedArray[0];
    }

    public int maxValue(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }
        insertionSort(sortedArray);
        return sortedArray[sortedArray.length - 1];
    }

    public int[] simpleNumbers(int[] array) {
        int count = 0;
        Service util = new Service();
        for (int element : array) {
            if (util.isSimple(element)) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (util.isSimple(array[i])) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }

    public int[] fibonacciNumbers(int[] array) {
        int count = 0;
        Service service = new Service();
        for (int i = 0; i < array.length; i++) {
            if (service.isFibonacci(array[i])) {
                count++;
            }
        }
        int[] fibonacciNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (service.isFibonacci(array[i])) {
                fibonacciNumbers[index] = array[i];
                index++;
            }
        }
        return fibonacciNumbers;
    }

    public int[] numbersWithDifferentDigits(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            String number = Integer.toString(numbers[i]);
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2] && chars[1] != chars[2]) {
                    count++;
                }
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            String number = Integer.toString(numbers[i]);
            if (number.length() == 3) {
                char[] chars = number.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2] && chars[1] != chars[2]) {
                    result[index] = numbers[i];
                    index++;
                }
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntArray intArray = (IntArray) o;
        if (value == intArray.getValue()) {
            return true;
        }
        if (intArray.getValue() == null || value == null) {
            return false;
        }
        int length = value.length;
        if (intArray.getValue().length != length) {
            return false;
        }
        for (int i = 0; i < length; i++)
            if (value[i] != intArray.getValue()[i]) {
                return false;
            }
        return true;
    }

    @Override
    public int hashCode() {
        if (value == null) {
            return 0;
        }
        int result = 1;
        for (int element : value) {
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IntArray{");
        int count = 0;
        for (int i : value) {
            sb.append(" value[").append(count).append("] = ").append(i);
            count++;
        }
        sb.append('}');
        return sb.toString();
    }
}
