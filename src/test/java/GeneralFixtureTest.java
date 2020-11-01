import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneralFixtureTest {

    // return 1
    int numero1, numero2, numero3;

    @Before
    public void setUp() throws Exception {
        numero1 = 2;
        numero2 = 2; // return 1
        numero3 = 3;
    }

    @Test
    public void usaTodos() {
        assertEquals("explanation", numero1, numero2);
        assertEquals("explanation", numero2, numero1);
    }

    @Test
    public void usaUm() {
        assertEquals("explanation", numero1, 2);
    }

}
