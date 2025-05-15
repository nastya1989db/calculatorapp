import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        CalculatorSum calculatorSum = new CalculatorSum();
        CalculatorMinus calculatorMinus = new CalculatorMinus();
        MultiplicationAndDivision multDiv = new MultiplicationAndDivision();
        CalculatorApp calc = new CalculatorApp(calculatorSum, calculatorMinus, multDiv);
//          CalculatorSwingUI calculatorSwingUI = new CalculatorSwingUI();


        System.out.print("Enter first number: ");
        double result12 = scanner.nextDouble();
        boolean resultBool = true;
        while (resultBool) {
            System.out.println("Enter operation (+, -, *, /, =, ), : ");
            String operation = scanner.next().trim();
            if ("+".equals(operation) || "-".equals(operation) || "*".equals(operation) || "/".equals(operation)) {
                System.out.print("Enter next number:");
                double nextNumber = scanner.nextDouble();


                try {
                    switch (operation) {

                        case "+":
                            result12 = calc.add(result12, nextNumber);
                            break;
                        case "-":
                            result12 = calc.subtract(result12, nextNumber);
                            break;
                        case "*":
                            result12 = calc.multiply(result12, nextNumber);
                            break;
                        case "/":
                            result12 = calc.divide(result12, nextNumber);
                            break;

                    }
                    System.out.println("Intermediate result:" + result12);

                } catch (ArithmeticException ex) {
                    System.out.println("Error:" + ex.getMessage());
                }
            } else if ("=".equals(operation)) {
                System.out.println("Final result:" + result12);
                resultBool = false;
            } else {
                System.out.println("Unknown operation, please use one of '+' '-' '*' '/' '='");
            }
        }
    }
}


