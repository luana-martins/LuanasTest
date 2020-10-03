import org.junit.Test;

/**
 * Test methods need to be simple and execute all statements in the production method.
 * Conditions within the test method will alter the behavior of the test and its expected output,
 * and would lead to situations where the test fails to detect defects in the production method
 * since test statements were not executed as a condition was not met.
 * Furthermore, conditional code within a test method negatively impacts the ease of comprehension by developers.
 *
 * Detection: A test method that contains one or more control statements
 * (i.e if, switch, conditional expression, for, foreach and while statement).
 * */
public class ConditionalTestLogicTest {

    @Test
    public void ifElseTest() {
        // Contém uma estrutura completa
        // Expected = 1
        // Result = 1
        if (true) {
        }
        else{
        }
    }

    @Test
    public void ifElseIfTest() {
        // Contém duas
        // Expected = 2
        // Result = 1
        if (true) {
        }
        else if(true){
        }
        else{
        }
    }

    @Test
    public void nestedIf(){
        // Contém condicional aninhada
        // Expected = 2
        // Result = 1
        if (true){
            if(true){
            }
        }
    }

    @Test
    public void doubleIf(){
        // Contém duas condicionais
        // Expected = 2
        // Result = 1
        if(true){
        }
        if (true){
        }
    }

    @Test
    public void ifWhile(){
        // Contém condicionais (diferentes) aninhadas
        // Expected = 2
        // Result = 1
        if(true){
            while(true){

            }
        }
    }

    @Test
    public void ifTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        if (true) {
            System.out.println("1");
        }
    }

    @Test
    public void forTest() {
        // Contém 1 estrutura condicional
        // Expected = 1
        // Result = 1
        for (int i = 0; i < 2; i++) {
        }
    }
    @Test
    public void whileTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        int i = 0;
        while (i < 2) {
            i++;
        }
    }
    @Test
    public void insidePrintTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        int i = 0;
        System.out.println((i <= 2) ? i : 2);
    }
    @Test
    public void foreachTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
    @Test
    public void switchCaseTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
    @Test
    public void doWhileTest() {
        // Contém 1 condicional
        // Expected = 1
        // Result = 1
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 2);
    }
}
