package Class;

/*An abstract class cannot be instantiated directly 
An abstract class can be instantiated either by a concrete subclass or by defining all the abstract method along with the new statement*/
abstract class PrintMessageAbstract {
    abstract void displayMessage(); // No method implementaion
}

class PrintMessage extends PrintMessageAbstract {
    void displayMessage() {
        System.out.print("Hello there!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        PrintMessage msg = new PrintMessage();
        msg.displayMessage();
    }
}
