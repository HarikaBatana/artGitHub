package off_oops.off_oops;

class Test {

   public static void main(String[] args) {
      Mobile mobile = null;
      // Cannot instantiate the type Mobile
      // mobile = new Mobile();

      Mobile mobile1 = null;
      // dynamic polymorphsim (the compiler does not know it.)
      double randomValue = Math.random();
      if (randomValue < 0.5) {
         mobile1 = new SmartPhone();
      } else {
         mobile1 = new FeaturePhone();
      }
      mobile1.calling();
   }
}

// Mainly used for inheritance
abstract class Mobile {
   final String internalMemorySize = "8gb";

   // absract methods do not have a body
   public abstract void calling();

   public abstract void texting();

   public void fm() {
      System.out.println("98.3 fm");
   }
}

class SmartPhone extends Mobile {

   public void calling() {
      System.out.println("Dial using virtual keys");
   }

   public void texting() {
      System.out.println("Text using virtual keys");
   }

}

class FeaturePhone extends Mobile {

   public void calling() {
      System.out.println("Dial using physical keys");
   }

   public void texting() {
      System.out.println("Text using physical keys");
   }

}

interface Mobile1 {
   // all the methods are abstract in interface Java 7.
   final String internalMemorySize = "8gb";

   // absract methods do not have a body
   public abstract void calling();

   public abstract void texting();
   // method with body
   // public void fm() {
   // System.out.println("98.3 fm");
   // }
}

interface Java8interferce {
   public void test();
   public static void test1(){

   }
   public default void test2(){

   }
   // public  void ohno(){

   // }
}