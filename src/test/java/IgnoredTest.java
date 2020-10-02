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
