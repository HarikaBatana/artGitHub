package off_oops.off_oops;

/*
This is a program.
It demonstrates the use of classes and objects.
It uses method parameters and return types.
*/
public class Employee {
   //instance variable can be accessed by the methods in the class
   private int empSalary = 30000;
/*
* Calculates and returns the total salary. The total salary is the total of salary and bonus.
*  @param bonus the bonus for the employee's hard work.
*/
   public float empDetails(float bonus) {
      //totalAmt is a local variable
      float totalAmt;
      totalAmt = empSalary + bonus;
      return totalAmt;
   }

   public static void main(String[] args) {
      // object creation
      Employee empObj = new Employee();
      float salWithBonus = empObj.empDetails(5000);
      System.out.println("Total salary : " +  salWithBonus );
   }
}