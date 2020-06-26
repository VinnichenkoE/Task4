package com.vinnichenko.task4_1.creator;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;

import java.util.Random;

public class IntArrayCreator {

    public static final int NUMBER_BORDER = 1000;

    public IntArray randomCreator(int length) throws ProgramException {
        if (length < 1) {
            throw new ProgramException("incorrect value of length");
        }
        Random random = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(NUMBER_BORDER);
        }
        return new IntArray(numbers);
    }
}
