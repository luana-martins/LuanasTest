import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Ideally, the test suite should not have a constructor.
 * Initialization of fields should be in the setUp() method.
 * Developers who are unaware of the purpose of setUp() method would
 * give rise to this smell by defining a constructor for the test suite.
 *
 * Detection: A test class that contains a constructor declaration.
 * */
public class ConstructorInitializationTest {

    public ConstructorInitializationTest(){
        // Expected = 1
        // Result =
    }

    public void setUp(){
        // Expected = 0
    }

    @Test
    public void aa(){
        // Só funciona se tiver pelo menos 1 método de teste válido!!!!!
        assertEquals("mensagem", 1, 1);
    }
}
