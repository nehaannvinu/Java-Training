public class TryWithReturn {
    public static String myMethod() {
        try {
            // try block
            return "Hello"; //Return statement is executed after finally block

        } finally {
            // finally
            System.out.println("This is the Finally block"); //Finally block is executed first
        }
    }

    public static void main(String args[]) {
        System.out.println(TryWithReturn.myMethod());
    }
}
