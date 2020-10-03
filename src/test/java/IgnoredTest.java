<<<<<<< HEAD
import org.junit.Ignore;
import org.junit.Test;

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
    @Ignore("luana")
    public void aa(){
        // Contabilizar 2
    }

    @Ignore
    public void bb(){
        // Não contabiliza, pois não é método de teste - faltou o @Test
    }
}
=======
import org.junit.Ignore;
import org.junit.Test;

@Ignore public class IgnoredTest {

    @Ignore
    @Test
    public void something() {
        // Contabilizar 1
    }

    @Test
    @Ignore
    public void aa(){
        // Contabilizar 1
    }

    @Ignore
    public void bb(){
        // Não contabiliza, pq não é teste
    }
}
>>>>>>> ab6001d6ae8bb38c69b54999bd7708b8f70125b1
