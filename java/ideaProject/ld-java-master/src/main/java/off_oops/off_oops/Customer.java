package off_oops.off_oops;

// JAVA BEAN
class Customer {
   // private variables are accessed only inside the class in which it is declared.
   private int cid;
   private String cname;

   // constructor
   // used for initializing the variables when the instance(object) is created.
   // same name as class
   // no return type

   public Customer(int cid, String cname) {
      // the local variable has higher priority
      this.cid = cid;
      this.cname = cname;
   }

   // set the value of cid (setter or mutator)
   public void setCid(int pCid) {
      if (pCid > 200) {
         cid = pCid;
      } else {
         System.out.println("Wrong Value");
      }
   }

   // get the value of cid (getter or accessor)
   public int getCid() {
      return cid;
   }

   public void details() {
      System.out.println(cid + " " + cname);
   }
}