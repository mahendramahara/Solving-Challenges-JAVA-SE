public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        // AutoBoxing Demo
        int a = 10;
        Integer b = a; // autoboxing
        System.out.println("AutoBoxing Demo");
        System.out.println("without wrapper class: " + a);
        System.out.println("with wrapper class: " + b);

        // AutoUnboxing Demo
        Integer x = 10; // AutoUnboxing
        int y = x;
        System.out.println("\n AutoUnboxing Demo");
        System.out.println("with wrapper class: " + x);
        System.out.println("Without wrapper class: " + y);
    }
}
