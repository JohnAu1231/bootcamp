public class Game {
  
  private int releaseYear;
  private String publisher;
  private int globalSoldCopies;
  private String gameType;
  private double price;

  //setter
  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  public void setGlobalSoldCopies(int globalSoldCopies) {
    this.globalSoldCopies = globalSoldCopies;
  }
  public void setGameType(String gameType) {
    this.gameType = gameType;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  //getter
  public int getReleaseYear() {
    return this.releaseYear;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public int getGlobalSoldCopies() {
    return this.globalSoldCopies;
  }
  public String getGameType() {
    return this.gameType;
  }
  public double getPrice() {
    return this.price;
  }

  //method
  public String toString() {
    return "Game(" //
      + "ReleasYear=" + this.releaseYear //
      + ", Publisher=" + this.publisher // 
      + ", GlobalSoldCopies=" + this.globalSoldCopies //
      + ", GameType=" + this.gameType // 
      + ", Price=" + this.price //
      + ")";
  }

  public double income() {
    return this.price * this.globalSoldCopies;
  }
  //main
  public static void main(String[] args) {
    Game callOfDuty = new Game();
    callOfDuty.setReleaseYear(2000);
    callOfDuty.setGlobalSoldCopies(40000);
    callOfDuty.setPublisher("Activision");
    callOfDuty.setGameType("FPS");
    callOfDuty.setPrice(39.9d);
    System.out.println(callOfDuty.income());
    System.out.println(callOfDuty.toString());
  }
}
