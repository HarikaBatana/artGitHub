package oops;

class EcomzApp {
   // main entry point
   public static void main(String[] args) {
      EcomzApp ecomzApp = new EcomzApp();
      ecomzApp.displayWelcome();
      // ecomzApp.useTV();
      ecomzApp.buyBook();
   }

   public void displayWelcome() {
      System.out.println();
      System.out.println("**********************");
      System.out.println("WELCOME TO ESHOPPING");
      System.out.println("**********************");
      System.out.println();
   }

   public void useTV() {
      // create an object
      // new operator creates the memory
      // BUYING A REDMI TV FOR DAD
      SmartTV redmiSmartTV = new SmartTV();
      // set the attribute value
      redmiSmartTV.size = 40;
      redmiSmartTV.switchOn();
      redmiSmartTV.displaySize();

      // BUYING A REDMI TV FOR MOM
      SmartTV lgSmartTv = new SmartTV();
      // set the attribute value
      lgSmartTv.model = "4K Ultra HD Smart OLED TV 65A1PTZ (Dark Meteo Titan) (2021 Model)";
      lgSmartTv.switchOn();
      lgSmartTv.displayModel();
   }

   public void buyBook() {
      AudibleBook audibleBook = new AudibleBook();
      // audibleBook.bookName = "Limitless";
      // audibleBook.listeningLength = "12 hours and 57 minutes";
      audibleBook.displayBookDetails();
      audibleBook.displayAudioBookDetails();
   }
}
