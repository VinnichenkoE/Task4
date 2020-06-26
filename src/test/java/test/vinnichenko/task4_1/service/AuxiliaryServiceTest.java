package test.vinnichenko.task4_1.service;

import com.vinnichenko.task4_1.service.AuxiliaryService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AuxiliaryServiceTest {

    AuxiliaryService auxiliaryService;

    @BeforeMethod
    public void setUp() {
        auxiliaryService = new AuxiliaryService();
    }

    @Test
    public void isSimpleTestPositive() {
        boolean condition = auxiliaryService.isSimple(43);
        assertTrue(condition);
    }

    @Test
    public void isSimpleTestNegative() {
        boolean condition = auxiliaryService.isSimple(42);
        assertFalse(condition);
    }

    @Test
    public void isPerfectSquareTestPositive() {
        boolean condition = auxiliaryService.isPerfectSquare(16);
        assertTrue(condition);
    }

    @Test
    public void isPerfectSquareTestNegative() {
        boolean condition = auxiliaryService.isPerfectSquare(55);
        assertFalse(condition);
    }

    @Test
    public void isFibonacciTestPositive() {
        boolean condition = auxiliaryService.isFibonacci(13);
        assertTrue(condition);
    }

    @Test
    public void isFibonacciTestNegative() {
        boolean condition = auxiliaryService.isFibonacci(16);
        assertFalse(condition);
    }
}