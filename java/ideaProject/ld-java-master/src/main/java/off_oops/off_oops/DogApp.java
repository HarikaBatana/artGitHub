package off_oops.off_oops;

public class DogApp {
   public static void main(String[] args) {
      System.out.println("\n***********************");
      System.out.println("Welcome to the Dog App");
      System.out.println("***********************");
      //create the object
      Dog nea;
      // create the instance
      nea = new Dog();
      nea.breed = "Neapolitan";
      nea.age = 5;

      //ask the dog to barkToIntorduce
      nea.barkToIntorduce();

   }
}