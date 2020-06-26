package test.vinnichenko.task4_1.parser;

import com.vinnichenko.task4_1.parser.IntArrayParser;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayParserTest {

    @Test
    public void stringToArrayTest() {
        IntArrayParser intArrayParser = new IntArrayParser();
        int[] expected = new int[]{10, 25, 55, 60};
        int[] actual = intArrayParser.stringToArray("10 25 55 60");
        assertEquals(actual, expected);
    }
}