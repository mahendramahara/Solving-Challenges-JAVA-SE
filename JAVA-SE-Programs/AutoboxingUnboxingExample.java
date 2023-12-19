// Title: AutoboxingUnboxingExample

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Example of autoboxing: converting primitive types to wrapper objects
        Integer intObj = 10;
        Double doubleObj = 3.14;
        Character charObj = 'A';
        Boolean boolObj = true;

        // Example of unboxing: converting wrapper objects to primitive types
        int intValue = intObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("Unboxed Integer: " + intValue);
        System.out.println("Unboxed Double: " + doubleValue);
        System.out.println("Unboxed Character: " + charValue);
        System.out.println("Unboxed Boolean: " + boolValue);
    }
}
// © Mahendra Mahara 2023
