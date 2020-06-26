package test.vinnichenko.task4_2.service;

import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_2.comparator.MaxComparator;
import com.vinnichenko.task4_2.comparator.MinComparator;
import com.vinnichenko.task4_2.comparator.SumComparator;
import com.vinnichenko.task4_2.service.JaggedArrayService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JaggedArrayServiceTest {

    JaggedArrayService jaggedArrayService;
    int[][] actual;

    @BeforeMethod
    public void setUp() {
        jaggedArrayService = new JaggedArrayService();
        actual = new int[][]{{10, 88, 95}, {1, 99, 20}, {100, 125, 30}};
    }

    @Test
    public void sortArrayTestMin() {
        int[][] expected = new int[][]{{1, 99, 20}, {10, 88, 95}, {100, 125, 30}};
        try {
            jaggedArrayService.sortArray(actual, new MinComparator(), false);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void sortArrayTestMinReverse() {
        int[][] expected = new int[][]{{100, 125, 30}, {10, 88, 95}, {1, 99, 20}};
        try {
            jaggedArrayService.sortArray(actual, new MinComparator(), true);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void sortArrayTestMax() {
        int[][] expected = new int[][]{{10, 88, 95}, {1, 99, 20}, {100, 125, 30}};
        try {
            jaggedArrayService.sortArray(actual, new MaxComparator(), false);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void sortArrayTestMaxReverse() {
        int[][] expected = new int[][]{{100, 125, 30}, {1, 99, 20}, {10, 88, 95}};
        try {
            jaggedArrayService.sortArray(actual, new MaxComparator(), true);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void sortArrayTestSum() {
        int[][] expected = new int[][]{{1, 99, 20}, {10, 88, 95}, {100, 125, 30}};
        try {
            jaggedArrayService.sortArray(actual, new SumComparator(), false);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void sortArrayTestSumReverse() {
        int[][] expected = new int[][]{{100, 125, 30}, {10, 88, 95}, {1, 99, 20}};
        try {
            jaggedArrayService.sortArray(actual, new SumComparator(), true);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void sortArrayTestException() throws ProgramException {
        jaggedArrayService.sortArray(actual, null, true);
    }

    @Test
    public void reverseTest() {
        int[][] expected = new int[][]{{100, 125, 30}, {1, 99, 20}, {10, 88, 95}};
        try {
            jaggedArrayService.reverse(actual);
        } catch (ProgramException e) {
            fail();
        }
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void reverseTestException() throws ProgramException {
        int[][] array = null;
        jaggedArrayService.reverse(array);
    }
}