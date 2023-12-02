// Title: Methods with Access Control Modifiers in Java

public class AccessControlExample {
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        AccessControlExample obj = new AccessControlExample();

        // Calling methods from the same class
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }
}

// © Mahendra Mahara 2023
