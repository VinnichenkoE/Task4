package test.vinnichenko.task4_1.validator;

import com.vinnichenko.task4_1.validator.IntArrayValidator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayValidatorTest {

    IntArrayValidator intArrayValidator;

    @BeforeMethod
    public void setUp() {
        intArrayValidator = new IntArrayValidator();
    }

    @Test
    public void isIndexCorrectTestPositive() {
        boolean condition = intArrayValidator.isIndexCorrect(5, 10);
        assertTrue(condition);
    }

    @Test
    public void isIndexCorrectTestNegative() {
        boolean condition = intArrayValidator.isIndexCorrect(5, 5);
        assertFalse(condition);
    }
}