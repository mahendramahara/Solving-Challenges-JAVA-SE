// Title: Nested Class Introduction with Access Control in Java

// Outer class
public class Outer {
    private int outerPrivateVar = 10;
    int outerDefaultVar = 20;
    protected int outerProtectedVar = 30;
    public int outerPublicVar = 40;

    // Inner class
    private class InnerPrivate {
        void display() {
            System.out.println("InnerPrivate accessing outerPrivateVar: " + outerPrivateVar);
        }
    }

    class InnerDefault {
        void display() {
            System.out.println("InnerDefault accessing outerDefaultVar: " + outerDefaultVar);
        }
    }

    protected class InnerProtected {
        void display() {
            System.out.println("InnerProtected accessing outerProtectedVar: " + outerProtectedVar);
        }
    }

    public class InnerPublic {
        void display() {
            System.out.println("InnerPublic accessing outerPublicVar: " + outerPublicVar);
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();

        // Accessing inner classes from the outer class
        InnerPrivate innerPrivateObj = outerObj.new InnerPrivate();
        innerPrivateObj.display();

        InnerDefault innerDefaultObj = outerObj.new InnerDefault();
        innerDefaultObj.display();

        InnerProtected innerProtectedObj = outerObj.new InnerProtected();
        innerProtectedObj.display();

        InnerPublic innerPublicObj = outerObj.new InnerPublic();
        innerPublicObj.display();
    }
}

// © Mahendra Mahara 2023
