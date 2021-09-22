package Encapsulation;

//Data members and member functions are bound together in same class
public class encapsulation {
    private double balance = 8000.00;

    public double getbalance() {
        return balance;
    }

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        System.out.println(e.getbalance());
    }

}
