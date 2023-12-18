// Title: ExceptionClassesDemo
import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionClasses {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        // IOException
        try {
            throw new IOException("IOException occurred");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // InputMismatchException (from java.util)
        try {
            throw new InputMismatchException("InputMismatchException occurred");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

// © Mahendra Mahara 2023
