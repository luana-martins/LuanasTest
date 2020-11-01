import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicNumberTest {

    @Test
    public void should_be_mistery_number(){
        // return 1
        MagicNumber calc = new MagicNumber();
        assertEquals(calc.add(2, 3),5);
        assertEquals(calc.add(3, 3),6);
    }

}
