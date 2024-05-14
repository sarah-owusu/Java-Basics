package Week2Lab.Question4;

public class Devider {

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 0;

            try {
                divide(num1, num2);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

        // Method to divide two numbers and throw an exception if divisor is zero
        public static void divide(int num1, int num2) throws ArithmeticException {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

