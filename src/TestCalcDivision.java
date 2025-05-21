import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestCalcDivision {
    private boolean areDoubleIsEqual( double a, double b, double epsilon){
        return Math.abs(a - b) <= epsilon;
    }
    @Test
    public void divisionTest (){
        double divided = 8.0;
        double divide = 4.0;
        double expected = 2.0;
        if (divide == 0) {
            System.out.println("Error!!! Zero is not for divide!!");
            assertFalse("Cannot divide by zero", true);
            return;
        }
        double result = divided/ divide;
        System.out.println("The test is running");
        if (areDoubleIsEqual(result, expected, 1e-10)){
            System.out.println("Results are close to each other");
        } else{
                System.out.println("Result: The values differ more than acceptable");
            }
            assertTrue("The division was performed correctly", areDoubleIsEqual(result, expected, 1e-10));
        }


    }

