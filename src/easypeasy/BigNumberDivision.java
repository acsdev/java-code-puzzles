package easypeasy;
import java.math.BigDecimal;

class BigNumberDivision {

    public static boolean isBigNumberDividedBy(String numberAsString, String divisorAsString) {
        BigDecimal number = new BigDecimal(numberAsString);
        BigDecimal divisor = new BigDecimal(divisorAsString);
        return number.divideAndRemainder(divisor)[1].equals(BigDecimal.ZERO);
   }

}