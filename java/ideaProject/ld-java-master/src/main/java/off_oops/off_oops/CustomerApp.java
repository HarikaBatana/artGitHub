package off_oops.off_oops;

class CustomerApp {
   public static void main(String[] args) {
      Customer spiderMan = new Customer(100, "SPIDER MAN");
      // spiderMan.cid = 200;
      // System.out.println(spiderMan.cid);
      // spiderMan.setCid(150);
      // int cid = spiderMan.getCid();
      // System.out.println(cid);
      spiderMan.details();
   }
}