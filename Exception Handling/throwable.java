class MyException extends Throwable
{
    MyException(){
        System.out.println("Just throwed an exception");
    }
    
} 
public class throwable
{
    public static void main(String[] args) throws MyException
    {
        MyException e = new MyException(); //Instance is created
        throw e; //throwing exception
    }
}