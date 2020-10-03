import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Occurs when a test method invokes several methods of the production object.
 * This smell results in difficulties in test comprehension and maintenance.
 * Detection: A test method contains multiple calls to multiple production methods.
 * */
public class EagerTest {
    @Test
    public void eager(){
        // metodo1 e metodo2 chamam o mesmo objeto da classe de produção
        // Expected Eager Test = 2 - asserts 1 e 3
        // Result Eager Test = 1

        Eager eager = new Eager();
        assertEquals("expected", eager.chamado(), "1");
        assertEquals("expected", eager.chamado(), "3");
    }
}
