public class CalculatorApp {
// Управляет процессом вычислений и взаимодействием с пользователем.
    private final CalculatorSum calculatorSum;
    private final CalculatorMinus calculatorMinus;
    private final MultiplicationAndDivision multDiv;

    public CalculatorApp(CalculatorSum calculatorSum, CalculatorMinus calculatorMinus, MultiplicationAndDivision multDiv) {
        this.calculatorSum = calculatorSum;
        this.calculatorMinus = calculatorMinus;
        this.multDiv = multDiv;
    }

    public double add(double a, double b) {
        return calculatorSum.add(a, b);
    }

    public double subtract(double a, double b) {
        return calculatorMinus.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return multDiv.multiply(a, b);
    }
    public double divide(double a, double b) {
        return multDiv.divide(a, b);
    }
}


