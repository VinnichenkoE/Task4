package test.vinnichenko.task4_1.creator;

import com.vinnichenko.task4_1.creator.IntArrayCreator;
import com.vinnichenko.task4_1.entity.IntArray;
import com.vinnichenko.task4_1.exception.ProgramException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayCreatorTest {

    @Test
    public void randomCreatorTest() {
        IntArrayCreator intArrayCreator = new IntArrayCreator();
        int expected = 5;
        try {
            IntArray intArray = intArrayCreator.randomCreator(5);
            int actual = intArray.getLength();
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }


    }
}