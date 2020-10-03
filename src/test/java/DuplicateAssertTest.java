import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * This smell occurs when a test method tests for the same condition multiple times within the same test method.
 * Detection: A test method that contains more than one assertion statement with the same parameters.
 * */

public class DuplicateAssertTest {

    @Test
    public void duplicate(){
        // Expected = 2
        // Result = 1
        assertEquals("mensagem", 1, 1);
        assertEquals("mensagem", 1, 1);
    }

}
