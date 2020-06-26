package test.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_1.service.IntArraySortService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class IntArraySortServiceTest {

    IntArraySortService intArraySortService;
    IntArray actual;

    @BeforeMethod
    public void setUp() {
        intArraySortService = new IntArraySortService();
        int[] array = new int[]{10, 52, 3, 5, 25};
        try {
            actual = new IntArray(array);
        } catch (ProgramException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertionSortTest() {
        int[] sortedNumbers = new int[]{3, 5, 10, 25, 52};
        try {
            IntArray expected = new IntArray(sortedNumbers);
            intArraySortService.insertionSort(actual);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void insertionSortTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySortService.insertionSort(intArray);
    }

    @Test
    public void bubbleSortTest() {
        int[] sortedNumbers = new int[]{3, 5, 10, 25, 52};
        try {
            IntArray expected = new IntArray(sortedNumbers);
            intArraySortService.bubbleSort(actual);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void bubbleSortTestException() throws ProgramException {
        int[] array = new int[]{10};
        IntArray intArray = new IntArray(array);
        intArraySortService.bubbleSort(intArray);
    }

    @Test
    public void selectionSortTest() {
        int[] sortedNumbers = new int[]{3, 5, 10, 25, 52};
        try {
            IntArray expected = new IntArray(sortedNumbers);
            intArraySortService.selectionSort(actual);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void selectionSortTestException() throws ProgramException {
        IntArray intArray = null;
        intArraySortService.selectionSort(intArray);
    }
}