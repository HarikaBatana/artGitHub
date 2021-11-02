package off_exceptions;

class OutOfMemroyErrorEx {
   public static void main(String[] args) {
String temp = "welcome ";
      for(int i = 1; i< 100000; i++)
      {
         temp += temp+temp;
         System.out.println( i );
      }
      System.out.println("does this execute?");
   }
}