//Throws keyword is used for handling checked exceptions . 
public class Throws {
    int divide(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        Throws obj = new Throws();
        try {
            System.out.println(obj.divide(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught! Cannot divide a number by zero");
        }
    }
}
