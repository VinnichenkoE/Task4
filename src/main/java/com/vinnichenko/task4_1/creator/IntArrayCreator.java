package com.vinnichenko.task4_1.creator;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_1.parser.IntArrayParser;
import com.vinnichenko.task4_1.reader.ProgramReader;

import java.util.Random;

public class IntArrayCreator {

    public static final int NUMBER_BORDER = 1000;

    public IntArray randomCreator(int length) throws ProgramException {
        Random random = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(NUMBER_BORDER);
        }
        return new IntArray(numbers);
    }
}
