package com.vinnichenko.task4_1.entity;

import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_1.validator.IntArrayValidator;

import java.util.OptionalInt;

public class IntArray {

    private int[] value;

    public IntArray(int[] value) throws ProgramException {
        if (value == null) {
            throw new ProgramException("array does not exist");
        }
        this.value = value;
    }

    public IntArray(int length) throws ProgramException {
        if (length <= 0) {
            throw new ProgramException("incorrect value of length");
        }
        this.value = new int[length];
    }

    public OptionalInt getElement(int index) {
        IntArrayValidator intArrayValidator = new IntArrayValidator();
        if (!intArrayValidator.isIndexCorrect(index, getLength())) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(value[index]);
    }

    public boolean setElement(int value, int index) {
        IntArrayValidator intArrayValidator = new IntArrayValidator();
        if (!intArrayValidator.isIndexCorrect(index, getLength())) {
            return false;
        }
        this.value[index] = value;
        return true;
    }

    public int getLength() {
        return this.value.length;
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
        if (intArray.value.length != value.length) {
            return false;
        }
        for (int i = 0; i < value.length; i++)
            if (value[i] != intArray.value[i]) {
                return false;
            }
        return true;
    }

    @Override
    public int hashCode() {

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
        sb.append(" }");
        return sb.toString();
    }
}
