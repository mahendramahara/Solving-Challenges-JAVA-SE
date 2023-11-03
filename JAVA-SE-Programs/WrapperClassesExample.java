// Title: WrapperClassesExample

public class WrapperClassesExample {
    public static void main(String[] args) {
        // Example of wrapper classes
        Integer intObj = new Integer(10);
        Double doubleObj = new Double(3.14);
        Character charObj = new Character('A');
        Boolean boolObj = new Boolean(true);

        // Auto-boxing: converting primitive types to wrapper objects
        Integer intAutoBoxing = 20;
        Double doubleAutoBoxing = 6.28;
        Character charAutoBoxing = 'B';
        Boolean boolAutoBoxing = false;

        // Unboxing: converting wrapper objects to primitive types
        int intUnboxing = intObj.intValue();
        double doubleUnboxing = doubleObj.doubleValue();
        char charUnboxing = charObj.charValue();
        boolean boolUnboxing = boolObj.booleanValue();

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("Auto-Boxing Integer: " + intAutoBoxing);
        System.out.println("Auto-Boxing Double: " + doubleAutoBoxing);
        System.out.println("Auto-Boxing Character: " + charAutoBoxing);
        System.out.println("Auto-Boxing Boolean: " + boolAutoBoxing);

        System.out.println("Unboxing Integer: " + intUnboxing);
        System.out.println("Unboxing Double: " + doubleUnboxing);
        System.out.println("Unboxing Character: " + charUnboxing);
        System.out.println("Unboxing Boolean: " + boolUnboxing);
    }
}

// © Mahendra Mahara 2023
