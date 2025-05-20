import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest3 {

    public static void main(String[] args) {
        CalculatorTest3 dd = new CalculatorTest3();
        dd.calculatorTest3();
        }


    // Проверка равенства двух double значений с заданной точностью
    private boolean calculatorTest3(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon;
    }


    public void calculatorTest3() {
        double value1 = 5.4 - 1.4;
        double value2 = 4.0;
boolean b = calculatorTest3(value1, value2, 1e-10);
        assertTrue("Значения близки друг другу", b);



    }
}
