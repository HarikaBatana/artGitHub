package off_oops.off_oops;

public class StaticPolymorphism {
   public static void main(String[] args) {
      X x = new X();
      x.m();
      x.m("welcome");
      x.m(0);
      x.m(0,"welcome");
      x.m("welcome",0);      
   }
}

class X {
   // Overloaded : multiple functions with the same name.
   // should vary in no of args, or type of args, or order of args.
   public void m() {
      System.out.println("m()");
   }

   public void m(String string) {
      System.out.println("m(String string)");
   }

   public void m(int number) {
      System.out.println("m(int number)");
   }

   public void m(String string, int number) {
      System.out.println("m(String string, int number)");
   }

   public void m(int number, String string) {
      System.out.println("m(int number, String string)");
   }
}