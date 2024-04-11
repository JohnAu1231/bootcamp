package poker;

import java.util.Arrays;

public class Deck {

  private Card[] cards;


  public Deck() {
    this.cards = new Card[52];
    for (int i = 0; i < 13; i++) {
      this.cards[i] = new Card(i+1, Card.DIAMOND);
    }
    for (int i = 0; i < 13; i++) {
      this.cards[i + 13] = new Card(i+1, Card.HEART);
    }
    for (int i = 0; i < 13; i++) {
      this.cards[i + 26] = new Card(i+1, Card.SPADES);
    }
    for (int i = 0; i < 13; i++) {
      this.cards[i + 39] = new Card(i+1, Card.CLUBS);
    }

  }

  public void changeDeck(int rank, char suit, int i) {
    this.cards[i].setCard(rank, suit);
  }

  public String toString() {

    return Arrays.toString(this.cards);
  }

  public int deckCardNum() {
    return cards.length;
  }

  public static void main(String[] args) {
    Card abc = new Card(1, Card.CLUBS);
    System.out.println(abc.toString());
    Deck firstDeck = new Deck();
    // firstDeck.changeDeck(1,"DIAMOND",2);
    System.out.println(firstDeck.toString());
    System.out.println(firstDeck.deckCardNum());

  }
}
