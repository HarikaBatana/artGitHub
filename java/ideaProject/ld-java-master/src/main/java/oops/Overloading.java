package oops;

class Overloading{
   public static void main(String[] args) {
         AudibleBook1 audibleBook = new AudibleBook1();
         // audibleBook.bookName = "Limitless";
         // audibleBook.listeningLength = "12 hours and 57 minutes";
         audibleBook.displayAudioBookDetails();

         // constructor overloading
         AudibleBook1 audibleBook1 = new AudibleBook1("90 mins");
         audibleBook1.displayAudioBookDetails();
         audibleBook1.modifyBook("55 mins");
         audibleBook1.displayAudioBookDetails();
   }
}

class AudibleBook1  {
 String listeningLength;
 String narrator;
 void displayAudioBookDetails(){
   System.out.println(listeningLength);
   System.out.println(narrator);
}
// default constructor : no parameters
public AudibleBook1(){
  listeningLength = "30 minutes";
  narrator = "narrated by the author";
}
// overload the constructor
public AudibleBook1(String listeningLength){
   this.listeningLength = listeningLength;
 }
// OVERLOAD THE CONSTRUCTOR TO TAKE listeningLength AND narrator

 public void modifyBook(String listeningLength){
    this.listeningLength = listeningLength;
 }
 // OVERLOAD THE modifyBook METHOD TO TAKE listeningLength AND narrator
}

