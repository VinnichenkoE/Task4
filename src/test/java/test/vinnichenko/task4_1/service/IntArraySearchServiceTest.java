package test.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_1.service.IntArraySearchService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArraySearchServiceTest {

    IntArraySearchService intArraySearchService;
    IntArray intArray;

    @BeforeMethod
    public void setUp() {
        intArraySearchService = new IntArraySearchService();
        int[] array = new int[]{2, 5, 10, 12, 25, 36, 301, 333};
        try {
            intArray = new IntArray(array);
        } catch (ProgramException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findNumberTest() {
        int expected = 3;
        try {
            int actual = intArraySearchService.findNumber(intArray, 12);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void findNumberTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.findNumber(intArray, 12);
    }

    @Test
    public void findNumberTestNegative() {
        int expected = -1;
        try {

            int actual = intArraySearchService.findNumber(intArray, 45);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void minValueTest() {
        int expected = 2;
        try {
            int actual = intArraySearchService.minValue(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void minValueTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.minValue(intArray);
    }

    @Test
    public void maxValueTest() {
        int expected = 333;
        try {
            int actual = intArraySearchService.maxValue(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void maxValueTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.maxValue(intArray);
    }

    @Test
    public void simpleNumbersTest() {
        int[] simpleNumbers = new int[]{2, 5};
        try {
            IntArray expected = new IntArray(simpleNumbers);
            IntArray actual = intArraySearchService.simpleNumbers(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void simpleNumbersTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.simpleNumbers(intArray);
    }

    @Test
    public void simpleNumbersTestNegative() {
        int[] notSimpleNumbers = new int[]{4, 8, 9, 15};
        int[] empty = new int[0];
        try {
            IntArray intArray = new IntArray(notSimpleNumbers);
            IntArray expected = new IntArray(empty);
            IntArray actual = intArraySearchService.simpleNumbers(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void fibonacciNumbersTest() {
        int[] fibonacciNumbers = new int[]{2, 5};
        try {
            IntArray expected = new IntArray(fibonacciNumbers);
            IntArray actual = intArraySearchService.fibonacciNumbers(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void fibonacciNumbersTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.fibonacciNumbers(intArray);
    }

    @Test
    public void fibonacciNumbersTestNegative() {
        int[] notFibonacciNumbers = new int[]{6, 9, 15, 25};
        int[] empty = new int[0];
        try {
            IntArray intArray = new IntArray(notFibonacciNumbers);
            IntArray expected = new IntArray(empty);
            IntArray actual = intArraySearchService.fibonacciNumbers(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void NumbersWithDifferentDigitsTest() {
        int[] differentDigitsNumbers = new int[]{301};
        try {
            IntArray expected = new IntArray(differentDigitsNumbers);
            IntArray actual = intArraySearchService.numbersWithDifferentDigits(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void NumbersWithDifferentDigitsTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySearchService.numbersWithDifferentDigits(intArray);
    }

    @Test
    public void NumbersWithDifferentDigitsTestNegative() {
        int[] notFibonacciNumbers = new int[]{6, 9, 15, 25, 333};
        int[] empty = new int[0];
        try {
            IntArray intArray = new IntArray(notFibonacciNumbers);
            IntArray expected = new IntArray(empty);
            IntArray actual = intArraySearchService.numbersWithDifferentDigits(intArray);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }
}