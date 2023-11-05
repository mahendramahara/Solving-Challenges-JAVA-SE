// Title: Demonstrating Exception Handling in Java
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching specific exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Finally block always executes, irrespective of whether an exception is caught or not
            System.out.println("Finally block executed.");
        }
    }

    // Method to demonstrate division by zero exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
// © Mahendra Mahara 2023
