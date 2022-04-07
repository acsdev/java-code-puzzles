package easypeasy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigNumberDivisionTest {

    @Test
    void shouldWorkWithSucess() {
        assertTrue(BigNumberDivision.isBigNumberDividedBy("12345678901234567890123456789012345678901234567852", "4"));
    }
    
    @Test
    void shouldWorkWithFail() { 
        assertFalse(BigNumberDivision.isBigNumberDividedBy("12345678901234567890123456789012345678901234567853", "4"));
    }

    @Test
    void testFailBecauseNumberIsNotNumber() {
       Assertions.assertThrows(NumberFormatException.class, () -> 
            BigNumberDivision.isBigNumberDividedBy("numberAsString", "1"));
    }

    
    @Test
    void testFailBecauseDivisionIsNotNumber() {
       Assertions.assertThrows(NumberFormatException.class, () -> 
            BigNumberDivision.isBigNumberDividedBy("10", "divisorAsString"));

    }
    

    @Test
    void testFailBecauseDivisionByZero() {
       Assertions.assertThrows(ArithmeticException.class, () -> 
            BigNumberDivision.isBigNumberDividedBy("10", "0"));

    }
    
}