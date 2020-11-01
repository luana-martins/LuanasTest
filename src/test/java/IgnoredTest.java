
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit 4 provides developers with the ability to suppress test methods from running.
 * Detection: A test method or class that contains the @Ignore annotation.
 * */
@Ignore
public class IgnoredTest {
    // Expected classe = 3
    // Result classe = 3

    @Test
    public void something() {
        // Contabiliza 1
    }

    @Test
    public void aa(){
        // Contabilizar 2
    }

    @Test
    public void falseEager() {
        Eager eager = new Eager();
        assertEquals("expected", eager.chamado2(), "1");
        assertEquals("expected", eager.chamado(), "3");
    }
}