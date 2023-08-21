class OuterClass {
    private int outerData = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("This is Inner class: Outer data = " + outerData);
        }
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("This Is Static nested class");
        }
    }

    // Method with a local class
    void localClassExample() {
        class LocalClass {
            void display() {
                System.out.println("This is Local class");
            }
        }

        LocalClass obj = new LocalClass();
        obj.display();
    }
}

public class NestedClassDemo {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();

        // Using inner class
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();

        // Using static nested class
        OuterClass.StaticNestedClass staticNestedObj = new OuterClass.StaticNestedClass();
        staticNestedObj.display();

        // Using local class
        outerObj.localClassExample();
    }
}
