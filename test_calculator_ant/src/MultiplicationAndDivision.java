public class MultiplicationAndDivision {
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible!");
        }
        return a / b;
    }
}

