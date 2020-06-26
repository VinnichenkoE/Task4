package com.vinnichenko.task4_1.validator;

public class IntArrayValidator {

    public boolean isIndexCorrect(int index, int length) {
        boolean result = false;
        if (index >= 0 && index < length) {
            result = true;
        }
        return result;
    }
}
