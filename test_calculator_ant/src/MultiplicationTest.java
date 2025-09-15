import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTest{
    @Test
    public void multiplicationTest() {
        double value1 = 15.0 * 2.0;
        double value2 = 30.0;


        System.out.println("The test is running.");
        if (areDoublesEqual(value1,value2, 1e-10)) {
            System.out.println("Result: The values are close to each other!");// Значения близки друг другу
        }else {
            System.out.println("Result:The values differ more than is acceptable");// Значения отличаются больше, чем допустимо.");
        }
//        Используем ваш собственный метод проверки близости double-значений
              boolean result = areDoublesEqual(value1, value2, 1e-10);

    // Проверяем условие
        assertTrue(areDoublesEqual(value1, value2, 1e-10), "The values are close to each other!");
    }
// Проверка равенства двух double значений с заданной точностью
private boolean areDoublesEqual(double a, double b, double epsilon) {
    return Math.abs(a - b) <= epsilon;
}

}


