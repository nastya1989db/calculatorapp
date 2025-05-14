import java.util.*;

public class CalculatorApp {
        private final SumAndDifference sumAndDiff;
        private final MultiplicationAndDivision multDiv;

        public CalculatorApp(SumAndDifference sumAndDiff, MultiplicationAndDivision multDiv) {
            this.sumAndDiff = sumAndDiff;
            this.multDiv = multDiv;
        }

        public double add(double a, double b) {
            return sumAndDiff.add(a, b);
        }

        public double subtract(double a, double b) {
            return sumAndDiff.subtract(a, b);
        }

        public double multiply(double a, double b) {
            return multDiv.multiply(a, b);
        }

        public double divide(double a, double b) {
            return multDiv.divide(a, b);
        }

}


