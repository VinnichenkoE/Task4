package test.vinnichenko.task4_1.reader;

import com.vinnichenko.task4_1.exception.ProgramException;
import com.vinnichenko.task4_1.reader.ProgramReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.testng.Assert.*;

public class ProgramReaderTest {

    ProgramReader programReader;

    @BeforeMethod
    public void setUp() {
        programReader = new ProgramReader();
    }

    @Test
    public void readFileTest() {
        String expected = "15 55 62 33 ";
        try {
            String actual = programReader.readFile("src/test/resources/data/test_data.txt");
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void readFileTestException() throws ProgramException {
        programReader.readFile("src/test/resources/data/does_not_exist.txt");
    }

    @Test
    public void readFileTestDefault() {
        String filePath = null;
        String expected = "45 55 86 52 63 66 89 ";
        try {
            String actual = programReader.readFile(filePath);
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test
    public void readConsoleTest() {
        String expected = "35 66 ";
        String consoleInput = "2\n35\n66";
        InputStream input = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(input);
        try {
            String actual = programReader.readConsole();
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }
}