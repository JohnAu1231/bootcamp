package poker;

public class Card {

  public static final char DIAMOND = 'D';

  public static final char HEART = 'H';

  public static final char SPADES = 'S';

  public static final char CLUBS = 'C';

  public static final int ONE = 1;
  // instance variable
  private char suit;

  private int rank;

  // constructor
  public Card(int rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public void setCard(int rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public String toString() {
    return "Card(" //
    + "rank=" + this.rank //
    + ", suit=" + this.suit //
    + ")";
  }
  public static void main(String[] args) {
    Card sss = new Card()
  }

  
}
