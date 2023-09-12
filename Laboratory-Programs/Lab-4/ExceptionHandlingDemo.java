public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        try {
            // NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException
            int[] numbers = { 1, 2, 3 };
            int value = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }

        try {
            // NumberFormatException
            String str = "ABC";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }

        try {
            // ClassNotFoundException
            Class<?> clazz = Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        }

        try {
            // IOException
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistent.txt");
        } catch (java.io.IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }

        try {
            // Custom Exception
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
