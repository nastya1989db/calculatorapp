import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTest{
    public static void main(String[] args) {
        MultiplicationTest t = new MultiplicationTest();
        t.multiplicationTest();
    }

    // Проверка равенства двух double значений с заданной точностью
    private boolean areDoublesEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon;
    }

    public void multiplicationTest() {
        double value1 = 15.0 * 2.0;
        double value2 = 30.0;


        System.out.println("The test is running.");
        if (areDoublesEqual(value1,value2, 1e-10)) {
            System.out.println("Result: The values are close to each other!");// Значения близки друг другу
        }else {
            System.out.println("Result:The values differ more than is acceptable");// Значения отличаются больше, чем допустимо.");
        }

        assertTrue(areDoublesEqual(value1, value2, 1e-10), "The values are close to each other!");
    }
}
