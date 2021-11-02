package off_exceptions;

public class Finally {
   public static void main(String[] args) {
      int i = 100;
      System.out.println("Dividing by zero");
      // int result = 100/10;
      // exception here
      // the program abruptly terminates at this point by raising an
      // ArithmeticException
      // ArithmeticException is an unchecked exception

      try {
         // int result = i / 0;
         int result = i / 10;
         System.out.println(result);
      } catch (ArithmeticException arithmeticException) {
         System.out.println("Do not divide anything by zero " + arithmeticException.getMessage());
      }
      finally{
         System.out.println("switch off the calculator.");
      }
      System.out.println("do i execute?");
   }
}