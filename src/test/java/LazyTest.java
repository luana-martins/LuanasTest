import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Occurs when multiple test methods invoke the same method of the production object.
 * Detection: Multiple test methods calling the same production method.
 * */
public class LazyTest {

    @Test
    public void metodo1(){
        // metodo1 e metodo2 chamam o mesmo objeto da classe de produção
        // Expected Lazy Test = 1
        // Result Lazy Test = 1
        
        Lazy lazy = new Lazy();
        assertEquals("expected", lazy.chamado(), "aa");
    }
    
    @Test
    public void metodo2(){
        // metodo1 e metodo2 chamam o mesmo objeto da classe de produção
        // Expected Lazy Test = 1 - asserts 1 e 3
        // Result Lazy Test = 1 - asserts 1 e 3

        Lazy lazy = new Lazy();
        assertEquals("expected", lazy.chamado(), "1");
        assertEquals("expected", lazy.chamado2(), "2");
        assertEquals("expected", lazy.chamado(), "3");
    }
}