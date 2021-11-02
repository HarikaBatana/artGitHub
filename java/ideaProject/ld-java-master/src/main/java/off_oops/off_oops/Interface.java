package off_oops.off_oops;

class Test100 {

   public static void main(String[] args) {
      Mobile mobile = null;
      // Cannot instantiate the type Mobile
      // mobile = new Mobile();

      Mobile2 mobile2 = null;
      // dynamic polymorphsim (the compiler does not know it.)
      double randomValue = Math.random();
      if (randomValue < 0.5) {
         mobile2 = new SmartPhone2();
      } else {
         mobile2 = new FeaturePhone2();
      }
      mobile2.calling();
   }
}

// implemented by other classes
interface Mobile2 {
   final String internalMemorySize = "8gb";
   // absract methods do not have a body
   public abstract void calling();
   public abstract void texting();
}

class SmartPhone2 implements Mobile2 {

   public void calling() {
      System.out.println("Dial using virtual keys");
   }

   public void texting() {
      System.out.println("Text using virtual keys");
   }

}

class FeaturePhone2 implements Mobile2 {

   public void calling() {
      System.out.println("Dial using physical keys");
   }

   public void texting() {
      System.out.println("Text using physical keys");
   }

}

interface i1{
 public void m1();
}

interface i2{
   public void m2();
}

interface i3 extends i1, i2{
   void m3();
}

abstract class a1 implements i1, i2{
   
}