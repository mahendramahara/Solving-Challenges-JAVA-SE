// Title: Throwing and Re-throwing Concept

class ThrowingAndRethrowing {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be greater than or equal to 18");
        }
    }

    static void processAge(int age) {
        try {
            validateAge(age);
            System.out.println("Age is valid");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e; // Re-throwing the exception
        }
    }

    public static void main(String[] args) {
        try {
            processAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught re-thrown exception: " + e.getMessage());
        }
    }
}

// © Mahendra Mahara 2023
