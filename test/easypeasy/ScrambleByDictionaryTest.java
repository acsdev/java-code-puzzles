package easypeasy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScrambleByDictionaryTest {

    @ParameterizedTest(name = "case #{index}: {arguments}")
    @CsvSource(value = {"sequoia:53qu014", "chill:ch1ll", "alabama:4l4b4m4"}, delimiterString = ":")
    void test(String input, String output) {
        String scrambeld = ScrambleByDictionary.apply(input);
        Assertions.assertEquals(output, scrambeld);
    }
}
