// Title: Using the super Keyword to Call Superclass Constructor in Java

class Parent {
    int parentField;

    Parent(int parentField) {
        this.parentField = parentField;
    }

    void display() {
        System.out.println("Parent Field: " + parentField);
    }
}

class Child extends Parent {
    int childField;

    Child(int parentField, int childField) {
        super(parentField);
        this.childField = childField;
    }

    void displayDetails() {
        super.display();
        System.out.println("Child Field: " + childField);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.displayDetails();
    }
}

// © Mahendra Mahara 2023
