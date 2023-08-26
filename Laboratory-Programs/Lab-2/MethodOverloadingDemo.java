public class MethodOverloadingDemo {

    // Method with two integer parameters
    public int add() {
        int a = 10;
        int b = 40;
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with one integer one float parameters
    public double add(int a, float b) {
        return a + b;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a string and an integer parameter
    public String concatenate(String str, int num) {
        return str + num;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        System.out.println("Adding ints: " + obj.add());
        System.out.println("Adding 3 ints: " + obj.add(5, 10, 15));
        System.out.println("Adding 1 int 1 float: " + obj.add(10, 5.5f));
        System.out.println("Adding 2 doubles: " + obj.add(3.5, 2.7));
        System.out.println("Concatenating: " + obj.concatenate("Num Is", 42));
    }
}
