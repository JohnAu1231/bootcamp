package poker;

import java.util.Arrays;
import java.util.Random;

public class ShuffleHelper {

  
  private Card[] cards;

  public ShuffleHelper(Deck deck) {
    this.cards = deck.getCards();
  }

  public Card[] getCards() {
    return this.cards;
  }

  public void riffle() {
    Card[] arr1 = new Card[this.cards.length/2];
    Card[] arr2 = new Card[this.cards.length/2];
    int idx = 0;
    int idx2 = 0;
    for (int i = 0; i < this.cards.length; i++) {
      if (idx < this.cards.length/2) {
      arr1[idx++] = this.cards[i];
      } else {
        arr2[idx2++] = this.cards[i];
      }
    }
    idx = 0;
    idx2 = 0;
      for (int i = 0; i < this.cards.length; i++) {
        if (i % 2 == 0) {
          this.cards[i] = arr1[idx++];
        } else {
          this.cards[i] = arr2[idx2++];
        }
      }
    }
  

    public void shuffle() {

    for (int i = 0; i < cards.length; i++) {
      int idx = new Random().nextInt(52 - i);
      if(this.cards[i] != this.cards[idx]) {
        Card temp = this.cards[i];
        this.cards[i] = this.cards[idx];
        this.cards[idx] = temp; 
      }
    }

  }
}
