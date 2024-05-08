package class_activity_5A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void itShouldAddTwoNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();
        int actual = calculator.addTwoNumbers(2,2);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void itShouldPrintHello(){
        SimpleCalculator cal = new SimpleCalculator();
        String actual = cal.hello();
        String expected = "Hello world";
        assertEquals(expected, actual);
    }
}