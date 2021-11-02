// PACKAGE GROUP RELATED CLASSES TOGETHER
package oops;

class SmartTV {
   // declare attributes/fields
   public String model;
   public byte size;
   // declare operation/behaviour/function/method
   public void switchOn(){
      System.out.println("Boot up....");
      System.out.println("Flashing logo");
   }
   public void displaySize(){
      System.out.println("Size : " + size);
   }
   public void displayModel(){
      System.out.println("Model : " + model);
   }
}