package com.vinnichenko.task4.array;

import com.vinnichenko.task4.array.creator.IntArrayCreator;
import com.vinnichenko.task4.array.entity.IntArray;

public class Main {
    public static void main(String[] args) {
        /*String s = " 562 2 32 455 12  542 11 7 801 131";
        IntArray intArray = new IntArray(s);
        int[] numbers = intArray.numbersWithDifferentDigits(intArray.getValue());
        for (int e: numbers) {
            System.out.println (e);
        }
        System.out.println(intArray);*/
        IntArrayCreator intArrayCreator = new IntArrayCreator();
        IntArray intArray1 = intArrayCreator.consoleCreate();
        System.out.println(intArray1);
    }

}
