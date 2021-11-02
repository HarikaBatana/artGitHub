package off_exceptions;

public class ThrowsEx {
   public static void main(String[] args) {
      ThrowsEx throwsEx = new ThrowsEx();
      // caller or calling method
      try
      {
      throwsEx.divide();
      } catch (ArithmeticException arithmeticException) {
         System.out.println("Do not divide anything by zero " + arithmeticException.getMessage());
      }
   }

   //called method
   public void divide() throws ArithmeticException{
      int i = 100;
      System.out.println("Dividing by zero");
      int result = i / 0;
      System.out.println(result);
      System.out.println("do i execute?");
   }
}