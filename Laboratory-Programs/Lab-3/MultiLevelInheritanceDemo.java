class Parent {
    void methodA() {
        System.out.println("Hello I am methodA in Parent class...");
    }
}

class Child extends Parent {
    void methodB() {
        System.out.println("Hello I am methodB in Child class...");
    }
}

class GrandChild extends Child {
    void methodC() {
        System.out.println("Hello I am methodC in GrandChild class...");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.methodB();
        obj.methodA();
        obj.methodC();
    }
}