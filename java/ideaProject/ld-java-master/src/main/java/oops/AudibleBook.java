package oops;

class AudibleBook extends Book {
  String listeningLength;

  void displayAudioBookDetails() {
    System.out.println(listeningLength);
  }

  // no parameters
  public AudibleBook() {
    listeningLength = "30 minutes";
  }

}