package com.vinnichenko.task4_1.entity;

public class IntArray {

    private int[] value;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArray(int[] value) {
        if (value != null) {
            this.value = value;
        } else {
            this.value = new int[DEFAULT_CAPACITY];
        }
    }

    public IntArray(int capacity) {
        if (capacity >= 0) {
            this.value = new int[capacity];
        } else {
            this.value = new int[DEFAULT_CAPACITY];
        }
    }

    public int getElement(int index) {
        return value[index];
    }

    public void setElement(int value, int index) {
        this.value[index] = value;
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
        if (intArray.getLength() != value.length) {
            return false;
        }
        for (int i = 0; i < value.length; i++)
            if (value[i] != intArray.getElement(i)) {
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
