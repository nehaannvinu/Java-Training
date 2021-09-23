class TryCatchFinally {
    public static void main(String args[]) {
        int x = 0;
        int y = 10;
        try 
        {

            int num = y / x;
            System.out.println("Inside try block"); //Will not be printed
        } 
        catch (Exception e)
        {

            System.out.println("Exception Occurred"); //Will be printed
            System.out.println(e); //Exception will be printed
        }
        finally
        {
            System.out.println("This is printed finally"); //finally block is executed
        }
        System.out.println("next-statement: Outside of try-catch"); //This is also printed
    }
}
