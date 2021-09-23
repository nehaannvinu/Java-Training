class NestedTry{
    public static void main(String args[]){
       //main try-block
       try
       {
         //try-block2
         try
         {     
             //try-block3
             try
             {
                 int arr[]= {1,2,3,4};
                 System.out.println(arr[10]); //Trying to accces an array index that doesnt exist.
             }
             //catch-block3
             catch(ArithmeticException e){
                 System.out.print("Arithmetic Exception");
                 System.out.println(" handled in try-block3");
             }
         }
         //catch-block2
         catch(ArithmeticException e)
         {
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in try-block2");
         }
        }  
        //main catch block
        catch(ArithmeticException e3)
        {
         System.out.print("Arithmetic Exception");
          System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4)
        {
         System.out.print("ArrayIndexOutOfBoundsException");
         System.out.println(" handled in main try-block");
        }
   }
 }
 