package off_oops;

public class Overriding {
   public static void main(String[] args) {
      Competency competency = new Competency();
      // the derived class method exeuctes.
      competency.trainingDetails();
   }
}

class FTP {
    public FTP(){

   }
   final String examDate = "5-Nov-2021";

   void testFinal() {
      // The final field FTP.examDate cannot be assigned
      // examDate = "6-Nov-2021";
   }

   void trainingDetails() {
      String trg = "Java,SQL,Angular";
      System.out.println("FTP training tec trg");
   }

   final void softSkills() {

   }
}

class Competency extends FTP {
   // copy of base class method
   // overriding the behaviour of the base class.
   public void trainingDetails() {
      // String trg = "Java,SQL,Angular";
      // System.out.println("FTP training tec trg");
      super.trainingDetails();
      String trg = "Block chain, Big Data...";
      System.out.println(trg);
   }
   // you cannot override a final method
   // void softSkills(){

   // }
}

final class TestBase {

}
// "The type TestDerived cannot subclass the final class TestBase"
// class TestDerived extends TestBase {

// }