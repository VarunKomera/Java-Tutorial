import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers and an operator
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the calculation based on the operator
            double result = calculate(num1, num2, operator);

            // Display the result
            System.out.println("Result: " + result);

        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to perform the calculation based on the operator
    private static double calculate(double num1, double num2, char operator) throws ArithmeticException {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator. Please use +, -, *, /");
        }

        return result;
    }
}
