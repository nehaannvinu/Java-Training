package Class;

//we created a static method, which can be accessed without creating an object 
public class StaticMethod {
    // Static method
    static void myStaticMethod() {
        System.out.println("This is a static method");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("This is public method");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Calling static method
        // No need to create object

        StaticMethod obj = new StaticMethod(); // Create an object of class
        obj.myPublicMethod(); // Call the public method on the object
    }

}
