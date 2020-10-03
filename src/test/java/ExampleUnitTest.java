import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * By default Android Studio creates default test classes when a project is created.
 * Detection: A test class is named either `ExampleUnitTest' or `ExampleInstrumentedTest'.
 * */
public class ExampleUnitTest {
    // Nesse caso, a classe recebe esse nome, mas os métodos o dev quem desenvolveu
    // Visto que a identificação da classe de teste depende dela receber o mesmo nome da classe de produção,
    // NUNCA vamos identificar esse test smell!!!!
    // Refazemos essa definição?
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void addition2() {
        assertEquals(4, 2 + 2);
    }
}
