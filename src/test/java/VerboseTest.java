import org.junit.Test;

public class VerboseTest {

    @Test
    public void verbose(){
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        String ab = a.concat ( b );
        String ac = a.concat ( c );
        String ad = a.concat ( d );
        String abc = a.concat ( b ).concat ( c );
        String abcd = a.concat ( b ).concat ( c ).concat ( d );
        String abcda = a.concat ( b ).concat ( c );
        String abcdd = a.concat ( b ).concat ( c );
    }
}
