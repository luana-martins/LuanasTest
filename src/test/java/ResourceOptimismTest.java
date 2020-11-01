import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceOptimismTest {
    @Test
    public void should_be_resource_optimism ( ) throws IOException {
// return 1
        File file = new File ( "file.txt" );
        FileWriter fw = new FileWriter ( file );
        fw.write ( "my text" );
        fw.close ( );
        file.delete ( );
    }
}

