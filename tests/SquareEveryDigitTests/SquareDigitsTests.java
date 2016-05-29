package SquareEveryDigitTests;

import SquareEveryDigitKata.SquareDigit;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareDigitsTests {
    @Test
    public void when_the_input_is_22_the_output_should_be_44() {
        assertEquals(44, new SquareDigit().squareDigits(22));
    }

    @Test
    public void when_the_input_is_333_the_output_should_be_999() {
        assertEquals(999, new SquareDigit().squareDigits(333));
    }
}
