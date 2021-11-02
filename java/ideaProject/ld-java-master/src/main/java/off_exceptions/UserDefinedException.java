package off_exceptions;

public class UserDefinedException {
   public static void main(String[] args) {
      int applicantAge = 7;
      try {
         if (applicantAge < 18) {
            // AgeInvalidException ageInvalidException = new AgeInvalidException();
            // throw ageInvalidException;
            AgeInvalidException1 ageInvalidException1 = new AgeInvalidException1(" : Invalid Age");
            throw ageInvalidException1;
         }
         System.out.println("Registered buddy, rock and roll!!!");
      }
      //  catch (AgeInvalidException ageInvalidException) {
      //    System.out.println("You are too small " );
      // }
      catch (AgeInvalidException1 ageInvalidException1) {
         String message = ageInvalidException1.getMessage();
         System.out.println("You are too small " + message);
         // System.out.println("You are too small " + ageInvalidException1.getMessage());
      }
   }
}

// user defined (unchecked) exception
class AgeInvalidException extends RuntimeException {
    
}

class AgeInvalidException1 extends RuntimeException {
    public AgeInvalidException1(String message){
      super(message);
    }
}
// user defined (checked) exception
// class AgeInvalidException extends Throwable {

// }

// user defined (checked) exception
// class AgeInvalidException extends Exception {

// }