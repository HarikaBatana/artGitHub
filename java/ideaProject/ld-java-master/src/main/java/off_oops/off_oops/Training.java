package off_oops.off_oops;

class Training {

   // default access (accessible within the package)
   //  private int tid = 100;
   //  private String tname = "java";

   int tid = 100;
   String tname = "java";
   public void trgDetails() {
      System.out.println("Training tid " + tid);
      System.out.println("Training tname " + tname);
   }
}

class ADM extends Training {
   String emptype = "G3";

   public static void main(String[] args) {
      ADM admObject = new ADM();
      admObject.trgDetails();
      System.out.println("Emp type : " + admObject.emptype);
      System.out.println(admObject.tid);
      System.out.println(admObject.tname);
   }
}