package com.vinnichenko.task4_1.service;

public class AuxiliaryService {

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
}
