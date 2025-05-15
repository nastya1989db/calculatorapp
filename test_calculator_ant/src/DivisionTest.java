import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DivisionTest {
    private boolean areDoublesEqual(double a, double b, double epsilon) {

        return Math.abs(a - b) <= epsilon;
    }
@Test
    public void divisionTest() {
        double dividend = 35.0;     // Дивиденд (делимое)
        double divisor = 7.0;       // Делитель
        double expectedResult = 5.0;// Ожидаемый результат

        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero!");
            assertFalse("Cannot divide by zero" , true);
            return;
        }

        double result = dividend / divisor;

        System.out.println("The test is running.");
        if (areDoublesEqual(result, expectedResult, 1e-10)) {
            System.out.println("Result: The values are close to each other!");
        } else {
            System.out.println("Result:The values differ more than is acceptable");
        }

        assertTrue("The division was performed correctly", areDoublesEqual(result, expectedResult, 1e-10));

    }

}
