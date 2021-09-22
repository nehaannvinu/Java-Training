package Class;

public class ConcreteClass {
    // concrete classes must have method implementation
    public void PrintMessage() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        ConcreteClass cc = new ConcreteClass(); // Instance created for the class
        cc.PrintMessage(); // Method invoked using to print message
    }
}
