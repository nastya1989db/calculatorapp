import java.awt.*;
import java.util.Locale;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.UK);
            SumAndDifference sumAndDiff = new SumAndDifference();
            MultiplicationAndDivision multDiv = new MultiplicationAndDivision();
            CalculatorApp calc = new CalculatorApp(sumAndDiff, multDiv);
//            CalculatorSwingUI calculatorSwingUI = new CalculatorSwingUI();



            boolean resultBool = true;

            System.out.print("Enter first number: ");
            double number1 = scanner.nextDouble();
            String operation = null;
            double number2;
            //need wrap to function
            do {
                System.out.print("Enter operation (+, -, *, /, =): ");
                operation = scanner.next().trim();
                //checking for wrong symbol in operation
                if ("+-*/=".contains(operation)) {
                    resultBool = false;
                }
            }
            while (resultBool);
            double result12 = number1;

            //print result already if =
            if ("=".contains(operation)) {
                System.out.println("Result: " + result12);
                resultBool = false;
            } else {
                //some +-*/
                resultBool = true;
            }

            while (resultBool) {
                System.out.print("Enter second number: ");
                number1 = result12;
                number2 = scanner.nextDouble();
                try {
                    if ("+-*/".contains(operation)) {
                        switch (operation) {

                            case "+":
                                result12 = calc.add(result12, number2);
                                System.out.println(number1 + operation + number2 + "=" + result12);
                                break;
                            case "-":
                                result12 = calc.subtract(result12, number2);
                                        System.out.println(number1 + operation + number2 + "=" + result12);
                                break;
                            case "*":
                                result12 = calc.multiply(result12, number2);
                                        System.out.println(number1 + operation + number2 + "=" + result12);
                                break;
                            case "/":
                                result12 = calc.divide(result12, number2);
                                System.out.println(number1 + operation + number2 + "=" + result12);
                                break;

                        }
                        do {
                            System.out.print("Enter operation (+, -, *, /, =): ");
                            operation = scanner.next().trim();
                            //checking for wrong symbol in operation
                            if ("+-*/=".contains(operation)) {
                                resultBool = false;
                            }
                        }
                        while (resultBool);
                        if ("=".contains(operation)) {
                            System.out.println("Result: " + result12);
                            resultBool = false;
                        } else {
                            //some +-*/
                            resultBool = true;
                        }
                    } else if ("=".contains(operation)) {
                        System.out.println("Result: " + result12);
                        resultBool = false;
                    } else {
                        System.out.println("Wrong operator");
                    }

                } catch (ArithmeticException ex) {
                    System.out.println(ex.getMessage());

                }
            };

        }
    }


