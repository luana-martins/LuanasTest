import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Occurs when a test method invokes several methods of the production object.
 * This smell results in difficulties in test comprehension and maintenance.
 * Detection: A test method contains multiple calls to multiple production methods.
 * */
public class EagerTest {
    @Test
    public void falseEager() {
        Eager eager = new Eager();
        assertEquals("expected", eager.chamado2(), "1");
        assertEquals("expected", eager.chamado(), "3");
    }

    @Test
    public void trueEager2() {
        Eager eager = new Eager();
        assertEquals("expected", eager.chamado(), "1");
        assertEquals("expected", eager.chamado(), "1");
        assertEquals("expected", eager.chamado2(), "1");
    }
}
