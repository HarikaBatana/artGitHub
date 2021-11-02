package off_oops.off_oops;

public class Dog {
   // accessible outside the class
   public String breed;
   public int age;

   public void barkToIntorduce() {
      System.out.println("I am " + breed + " and my age is " + age );
      System.out.println("I like barking .... bow wow");
   }
}