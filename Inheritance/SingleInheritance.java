//package Inheritance;

//In Single Inheritance one class extends another class (one class only).
class Parent {
    void ParentDetails() {
        System.out.println("This is about the parent");
    }
}

class Child extends Parent { // Child class inherits parent class
    void ChildDetails() {
        System.out.println("This is about the child");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.ChildDetails(); // Accessing child details
        c.ParentDetails(); // Accessing parent details
    }

}
