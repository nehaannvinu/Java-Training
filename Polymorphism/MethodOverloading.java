//Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.

package Polymorphism;

class Adder {

    // Method that adds two numbers
    public void add(int a, int b) {
        System.out.println("Sum of two:" + (a + b));
    }

    // Method that adds three numbers
    public void add(int a, int b, int c) {
        System.out.println("Sum of three:" + (a + b + c));
    }

    // Method that concats two strings
    public void add(String x, String y) {
        System.out.println("Concat of strings:" + (x + y));
    }
}

class Main {
    public static void main(String args[]) {
        Adder obj = new Adder(); // creating obj for Adder class
        obj.add(10, 20); // Method for adding two numbers will be called
        obj.add(10, 20, 30); // Method for adding 3 numbers will be called
        obj.add("Hello", "World"); // Method for string concat will be called
    }
}