package evan.chen.app.unittest_calculator_sample;

import android.nfc.Tag;
import android.util.Log;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void add_number1_1_number2_2_should_return_3() throws Exception {
        //arrange
        Calculator target = new Calculator();

        int number1 = 1;
        int number2 = 2;
        int expected = 3;

        //act
        int actual = target.add(number1, number2);

        //assert
        assertEquals(expected, actual);
    }
}