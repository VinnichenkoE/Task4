package com.vinnichenko.task4_1.creator;

import com.vinnichenko.task4_1.entity.IntArray;

import java.util.Random;

public class IntArrayCreator {

    public static final int NUMBER_BORDER = 1000;

    public IntArray randomCreator(int capacity) {
        Random random = new Random();
        int[] numbers = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            numbers[i] = random.nextInt(NUMBER_BORDER);
        }
        return new IntArray(numbers);
    }
}
