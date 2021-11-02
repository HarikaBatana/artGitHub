package off_exceptions;

import java.util.Scanner;

public class ExceptionExample {
   // int a=10,b=2,c,sum;
   int a = 10;
   int b = 2;
   int c;
   int sum;
   // int eid1 [] = new int []{22,33,44};
   // int [] eid2 = new int []{22,33,44};
   // int eid[];
   int[] eid;

   public void test() {
      // new allocates the memory
      eid = new int[3];
      eid[0] = 22;
      eid[1] = 33;
      eid[2] = 44;

      System.out.println(eid.length);
      System.out.println(eid[0]);
      System.out.println(eid[1]);
      System.out.println(eid[2]);

      System.out.println("Looping through array.");
      for (int index = 0; index < eid.length; index++) {
         System.out.println(eid[index]);
      }
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter the number");
      String numberString = scanner.next();
      
      try {
         // NumberFormatException
         int add = Integer.parseInt(numberString);
      sum = a + add;
      System.out.println("sum " + sum);
         // arithmetic exception
         c = a / b;
         System.out.println(c);
         // array index excep....
         System.out.println(eid[21]);
      } catch (ArithmeticException arithmeticException) {
         System.out.println("Do not divide anything by zero " + arithmeticException.getMessage());
      } catch (ArrayIndexOutOfBoundsException exception) {
         System.out.println("Exception : " + exception);
         System.out.println("Message : " + exception.getMessage());
      } catch (NumberFormatException exception) {
         System.out.println("Exception : " + exception.getMessage());
      }
      finally{
         System.out.println("END OF PROGRAM");
      }
   }

   public static void main(String[] args) {

      ExceptionExample example = new ExceptionExample();
      example.test();
      // int i = 100;
      // System.out.println("Dividing by zero");
      // // int result = 100/10;
      // // exception here
      // // the program abruptly terminates at this point by raising an
      // // ArithmeticException
      // // ArithmeticException is an unchecked exception
      // try {
      // int result = i / 0;
      // System.out.println(result);
      // } catch (ArithmeticException arithmeticException) {
      // System.out.println("Do not divide anything by zero " +
      // arithmeticException.getMessage());
      // }
      // System.out.println("do i execute?");
   }
}