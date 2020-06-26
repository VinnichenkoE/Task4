package com.vinnichenko.task4_1.parser;

public class IntArrayParser {

    public static final String REGEX = "\\s+";

    public int[] stringToArray(String stringNumbers) {
        String[] numbers = stringNumbers.trim().split(REGEX);
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
        }
        return result;
    }
}
