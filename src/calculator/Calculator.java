package calculator;
import customExceptions.InvalidOperatorException;

public class Calculator {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1" +
                            " operator operand2");
            System.exit(1);
        }

        try {
            int operand1 = 0;
            int operand2 = 0;
            operand1 = Integer.parseInt(args[0]);
            operand2 = Integer.parseInt(args[2]);

            char operator = args[1].charAt(0);
            int result = getResult(operand1, operator,
                    operand2);
            // Display result
            System.out.println(args[0] + ' ' + args[1] +
                    ' ' + args[2] + " = " + result);
        }
        catch (InvalidOperatorException ioe) {
            System.out.println("Error: " + ioe.getMessage());
            System.exit(1);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Error: Invalid number format. Please enter valid integers.");
            System.exit(1);
        }
    }



    private static int getResult(int operand1,
                                 char operator,
                                 int operand2) throws InvalidOperatorException {
        switch (operator) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '−' -> {
                return operand1 - operand2;
            }
            case '*' -> {
                return operand1 * operand2;
            }
            case '/' -> {
                return operand1 / operand2;
            }
            default -> {
                throw new InvalidOperatorException("operator " + operator + " is not valid. Valid ones: +, -, /, *");
            }
        }
    }
}
