public class OperatorsDemo {
    public static void main(String[] args) {
        // Unary Operator
        int x = 10;
        int y = -x; // unary minus operator
        boolean isTrue = true;
        boolean isFalse = !isTrue; // unary logical complement operator

        System.out.println("Unary Operator:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("isTrue = " + isTrue);
        System.out.println("isFalse = " + isFalse);

        // Arithmetic Operator
        int a = 10;
        int b = 5;
        int sum = a + b; // addition operator
        int difference = a - b; // subtraction operator
        int product = a * b; // multiplication operator
        int quotient = a / b; // division operator
        int remainder = a % b; // modulus operator

        System.out.println("\nArithmetic Operator:");
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);

        // Shift Operator
        int num = 8;
        int leftShiftResult = num << 2; // left shift operator
        int rightShiftResult = num >> 2; // right shift operator

        System.out.println("\nShift Operator:");
        System.out.println("leftShiftResult = " + leftShiftResult);
        System.out.println("rightShiftResult = " + rightShiftResult);

        // Relational Operator
        int value1 = 5;
        int value2 = 10;
        boolean isEqual = value1 == value2; // equality operator
        boolean isNotEqual = value1 != value2; // inequality operator
        boolean isGreater = value1 > value2; // greater than operator
        boolean isLess = value1 < value2; // less than operator
        boolean isGreaterOrEqual = value1 >= value2; // greater than or equal to operator
        boolean isLessOrEqual = value1 <= value2; // less than or equal to operator

        System.out.println("\nRelational Operator:");
        System.out.println("isEqual = " + isEqual);
        System.out.println("isNotEqual = " + isNotEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLess = " + isLess);
        System.out.println("isGreaterOrEqual = " + isGreaterOrEqual);
        System.out.println("isLessOrEqual = " + isLessOrEqual);

        // Bitwise Operator
        int operand1 = 12;
        int operand2 = 7;
        int bitwiseAndResult = operand1 & operand2; // bitwise AND operator
        int bitwiseOrResult = operand1 | operand2; // bitwise OR operator
        int bitwiseXorResult = operand1 ^ operand2; // bitwise XOR operator

        System.out.println("\nBitwise Operator:");
        System.out.println("bitwiseAndResult = " + bitwiseAndResult);
        System.out.println("bitwiseOrResult = " + bitwiseOrResult);
        System.out.println("bitwiseXorResult = " + bitwiseXorResult);

        // Logical Operator
        boolean p = true;
        boolean q = false;
        boolean logicalAndResult = p && q; // logical AND operator
        boolean logicalOrResult = p || q; // logical OR operator

        System.out.println("\nLogical Operator:");
        System.out.println("logicalAndResult = " + logicalAndResult);
        System.out.println("logicalOrResult = " + logicalOrResult);

        // Ternary Operator
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("\nTernary Operator:");
        System.out.println("result = " + result);

        // Assignment Operator
        int variable = 5;
        variable += 3; // equivalent to variable = variable + 3;

        System.out.println("\nAssignment Operator:");
        System.out.println("variable = " + variable);
    }
}
