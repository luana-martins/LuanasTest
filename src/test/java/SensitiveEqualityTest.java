import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SensitiveEqualityTest {
    @Test
    public void should_be_sensitive_equality() {
        String str = "my string";
        assertEquals(str.toString(), "my string");
    }
}
