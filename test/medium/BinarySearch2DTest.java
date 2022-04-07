package medium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BinarySearch2DTest {

    @ParameterizedTest(name = "case #{index}: {arguments}")
    @CsvSource(value = { "7; 9; 3,4; 1,7; 2", "25; 33; 2,29; 24,2; 5", "100; 100; 5,98; 0,1; 7" }, delimiterString = ";")
    void test(int width, int height, String posistionStart, String positionTarget, int numberOfHoops) {
        int positionX = Integer.parseInt(posistionStart.split(",")[0]);
        int positionY = Integer.parseInt(posistionStart.split(",")[1]);
        int targerX = Integer.parseInt(positionTarget.split(",")[0]);
        int targetY = Integer.parseInt(positionTarget.split(",")[1]);

        int hoops = BinarySearch2D.find(
                width,
                height,
                positionX,
                positionY,
                targerX,
                targetY);
        Assertions.assertEquals(numberOfHoops, hoops);
    }
}