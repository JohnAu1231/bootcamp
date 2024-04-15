package poker;

import java.util.Arrays;
import java.util.Random;

public class Deck {
  // public static final use for constant
  public static final Suit[] SUITS =
      new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  public static final Rank[] RANKS = new Rank[] {Rank.ONE, Rank.TWO, Rank.THREE, Rank.FOUR,
   Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.ELEVEN, Rank.TWLVE, Rank.THIRTEEN};

  private final Card[] cards; // final = final the pointer



  private Deck(boolean isEmpty) {
    if (isEmpty) {
      this.cards = new Card[0];
      return;
    }
    this.cards = new Card[52];
    int i = 0;
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        this.cards[i++] = new Card(rank, suit);
      }
    }
  }


  public Card[] getCards() {
    return this.cards;
  }


  public void changeDeck(Rank rank, Suit suit, int i) {
    this.cards[i].setCard(rank, suit);
  }

  public String toString() {

    return  "Deck(" //
    + "cards=" + Arrays.toString(this.cards) //
    + ")";
  }

  public int deckCardNum() {
    return cards.length;
  }



  public static Deck empty() {
    return new Deck(true);
  }

  public static Deck full() {
    return new Deck(false);
  }


  public static void main(String[] args) {
    Card abc = new Card(Rank.ONE, Suit.CLUB);
    System.out.println(abc.toString());
    Deck firstDeck = new Deck(true);
    // firstDeck.shuffle();

    // firstDeck.changeDeck(1,"DIAMOND",2);
    System.out.println(firstDeck.toString());
    int idx = new Random().nextInt(52);
    System.out.println(idx);
    System.out.println(firstDeck.deckCardNum());
    // System.out.println(firstDeck.deckCardNum());

    // Deck deck2 = Deck.empty();
    Deck deck3 = Deck.full();
    // System.out.println(deck3.toString());
    // deck3 = Deck.empty();
    // System.out.println(deck3.toString());
    ShuffleHelper shuf3 = new ShuffleHelper(deck3);
    shuf3.riffle();
    System.out.println(deck3.toString());
    // shuf3.riffle();
    // System.out.println(deck3.toString());
    // shuf3.riffle();
    // System.out.println(deck3.toString());
    // shuf3.riffle();
    // System.out.println(deck3.toString());

    Suit x = Suit.SPADE;
    if ( x == Suit.HEART) {
      System.out.print("yes");
    } else { 
      System.out.print("NO");
    }



  }

}
