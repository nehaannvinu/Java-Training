class Throw {
   void checkAge(int age) {
      if (age > 18) {
         System.out.println("Eligible for voting");
      } else {
         throw new ArithmeticException("Not Eligible to vote");
      }
   }

   public static void main(String args[]) {
      Throw obj = new Throw();
      obj.checkAge(12);
      System.out.println("End Of Program");
   }
}