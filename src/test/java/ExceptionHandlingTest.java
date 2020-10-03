import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * This smell occurs when a test method explicitly a passing or failing of a test method is
 * dependent on the production method throwing an exception.
 * Developers should utilize JUnit's exception handling to automatically pass/fail the test instead of
 * writing custom exception handling code or throwing an exception.
 *
 * Detection: A test method that contains either a throw statement or a catch clause.
 * */
public class ExceptionHandlingTest {

    @Test(expected = ArithmeticException.class)
    public void intRangeCheck (){
        // Uso do expected - não contabilizar
        // Expected = 0
        // Result = 0
        ExceptionHandling a = new ExceptionHandling();
        a.intRangeCheck(BigInteger.valueOf(2147483647));
    }

    @Test
    public void intRangeException (){
        // Expected = 1
        // Result = 1
        try {
            ExceptionHandling a = new ExceptionHandling();
            a.intRangeCheck(BigInteger.valueOf(2147483647));
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {

        }
    }

    @Test
    public void intRangeException3 (){
        // Expected = 2
        // Result = 1
        try {
            ExceptionHandling a = new ExceptionHandling();
            a.intRangeCheck(BigInteger.valueOf(2147483647));
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {

        }

        try {
            ExceptionHandling a = new ExceptionHandling();
            a.intRangeCheck(BigInteger.valueOf(2147483647));
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {

        }
    }

    @Test
    public void intRangeException2 () throws ArithmeticException {
        // Expected 1
    }
}
