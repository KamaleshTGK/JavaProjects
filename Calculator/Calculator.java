import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers are not allowed.");
            }

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            int result = 0;
            switch(op) {
                case '+' : result = a + b; break;
                case '-' : result = a - b; break;
                case '*' : result = a * b; break;
                case '/' :
                    if (b == 0) throw new ArithmeticException("Cannot Divide By zero!.");
                    result = a / b; break;
                default:
                    throw new Exception("Invalid Operation.");
            }

            System.out.println("Result: " + result);
        } catch (InvalidInputException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Calculator finished.");
        }

        sc.close();
    }
}
