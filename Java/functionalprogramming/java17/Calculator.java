package functionalprogramming.java17;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Operation {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BinaryOperator<Double> add = Operation::add;
        BinaryOperator<Double> subtract = Operation::subtract;
        BinaryOperator<Double> multiply = Operation::multiply;
        BinaryOperator<Double> divide = Operation::divide;

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /): ");
        String operator = scanner.next();

        double result = 0;

        switch (operator) {
            case "+":
                result = add.apply(num1, num2);
                break;
            case "-":
                result = subtract.apply(num1, num2);
                break;
            case "*":
                result = multiply.apply(num1, num2);
                break;
            case "/":
                result = divide.apply(num1, num2);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        System.out.println("Result: " + result);
    }
}
