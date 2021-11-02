package off_exceptions;

public class UnhandledException {
   public static void main(String[] args) {
      int i = 100;
      System.out.println("Dividing by zero");
      // int result = 100/10;
      // exception here
      // the program abruptly terminates at this point by raising an ArithmeticException
      // ArithmeticException is an unchecked exception
      int result = i/0;   
      System.out.println(result);
      System.out.println("do i execute?");
   }
}