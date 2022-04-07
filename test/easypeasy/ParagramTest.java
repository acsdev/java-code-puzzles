package easypeasy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParagramTest {
    
    @ParameterizedTest
    @CsvSource(value = {"asdfghjkoi, true","asdfghjf, false"})
    void test(String text, boolean is) {
        assertEquals(is, Paragram.is(text));
    }
}
