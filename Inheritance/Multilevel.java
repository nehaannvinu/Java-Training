
//In Single Inheritance one class extends another class (one class only).
class parent {
    void ParentDetails() {
        System.out.println("This is about the parent");
    }
}

class Child1 extends parent { // Child1 class inherits parent class
    void Child1Details() {
        System.out.println("This is about the child1");
    }
}

class Child2 extends Child1 { // Child2 class inherits child 1
    void Child2Details() {
        System.out.println("This is about the child2");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.Child2Details();
        c.Child1Details();
        c.ParentDetails();
    }

}
