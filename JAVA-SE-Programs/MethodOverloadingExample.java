// Title: Method Overloading Example in Java

public class MethodOverloadingExample {
    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling overloaded methods
        System.out.println("Sum of 2 and 3: " + add(2, 3)); // Calls the first add method
        System.out.println("Sum of 2, 3, and 4: " + add(2, 3, 4)); // Calls the second add method
        System.out.println("Sum of 2.5 and 3.5: " + add(2.5, 3.5)); // Calls the third add method
    }
}

// © Mahendra Mahara 2023
