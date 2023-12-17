// Title: Throwing and Re-throwing Concept

import java.io.IOException;

class ExceptionThrows {
    static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be greater than or equal to 18");
        }
    }

    static void processAge(int age) throws ArithmeticException {
        validateAge(age);
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            processAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

// © Mahendra Mahara 2023
