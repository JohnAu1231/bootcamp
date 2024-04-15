package poker;

import java.util.Random;

public class ShuffleHelper {

  public ShuffleHelper(Deck deck) {
    this.cards = deck.getCards();
  }
  
  private Card[] cards;

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

    Card[] arr = this.cards;
    int count = 52;
    for (int i = 0; i < cards.length; i++) {
      int idx = new Random().nextInt(52 - i);
      this.cards[count - 1] = arr[idx];
      for (int j = idx + 1; j < count; j++) {
        if (j == count - 1) {
          break;
        }
        Card temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
      count--;
    }

  }
}
