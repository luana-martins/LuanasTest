import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Occurs when a test method has multiple non-documented assertions. 
 * Multiple assertion statements in a test method without a descriptive message impacts 
 * readability/understandability/maintainability as it’s not possible to understand the 
 * reason for the failure of the test.
 *
 * Detection: A test method contains more than one assertion statement without without an 
 * explanation/message (parameter in the assertion method).
 * */
public class AssertionRouletteTest {

    @Test
    public void apenasUm(){
        // Expected = 1
        // Result = 1
        assertEquals("explanation", 1, 1);
        assertEquals(2, 2);
    }

    @Test
    public void doisAssert(){
        // Expected = 3
        // Result = 1
        assertEquals("explanation", 1, 1);
        assertEquals(2, 2);
        assertTrue(1<2);
        assertNotEquals(1,2);
    }
}
