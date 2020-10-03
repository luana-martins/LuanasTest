import java.math.BigInteger;

public class ExceptionHandling {
    public BigInteger intRangeCheck(BigInteger val) {
        if (val.compareTo(BigInteger.valueOf(2147483647)) == 1) {
            throw new ArithmeticException("Integer overflow");
        }
        return val;
    }
}
