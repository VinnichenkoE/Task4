package com.vinnichenko.task4.array.creator;

import com.vinnichenko.task4.array.entity.IntArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntArrayCreator {
    public IntArray consoleCreate() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input length of array");
        String input = "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace(); // FIXME: 22.06.2020 
        }
        int length = Integer.parseInt(input);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input " + i + " element"); // FIXME: 22.06.2020 
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace(); // FIXME: 22.06.2020 
            }
            result[i] = Integer.parseInt(input);
        }
        return new IntArray(result);
    }

}