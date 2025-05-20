import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalcSumTest {

    // Проверка равенства двух double значений с заданной точностью
    private boolean calcSum(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon;
    }

    // Применяем аннотацию @Test, чтобы JUnit понимал, что это тестовый метод
    @Test
    public void calculatorTest3() {
        double value1 = 5.4 + 1.4;
        double value2 = 6.8;
        boolean b = calcSum(value1, value2, 1e-10); // проверяем сумму
        assertTrue("the value of the sums is close", b);      // утверждение успеха теста
    }
}