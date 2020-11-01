import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RedundantAssertionTest {
     // return 2
             @Test
public void should_be_redundant_assertion(){
        assertEquals("mensagem", true, true);
        assertEquals("mensagem", false, false);
             }
    @Test
    public void should_be_redundant_assertion2(){
                  // return 1
                   assertEquals("mensagem", true, true);
               }

}
