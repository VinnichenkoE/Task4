package com.vinnichenko.task4.array.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Service {

    public int[] FibonacciNumbers(int bound) {
        int previous = 0;
        int current = 1;
        int count = 0;
        while (current <= bound){
            int next = previous + current;
            previous = current;
            current = next;
            count++;
        }
        int[] fibonacciNumbers = new int[count + 1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-2] + fibonacciNumbers[i-1];
        }
        return fibonacciNumbers;
    }

    public boolean isSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPerfectSquare(int number) {
        final double root = Math.sqrt(number);
        return Double.compare(root, Math.floor(root)) == 0;
    }

    public boolean isFibonacci(int number) {
        final int fiveTimesSquare = 5 * number * number;
        return isPerfectSquare(fiveTimesSquare + 4) || isPerfectSquare(fiveTimesSquare - 4);
    }

    public String input() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }
}
