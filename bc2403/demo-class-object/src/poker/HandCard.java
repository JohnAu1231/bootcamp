package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HandCard {
  

  private Card[] handCards;


  // public void setPlayer(Player player) {
  //   this.player = player;
  // }
  public HandCard(Card[] cards) {
    this.handCards = cards;
  }

  public void setHandCard(Card[] handCards) {
    this.handCards = handCards;
  }

  // public Player getHandCardPlayer() {
  //   return this.player;
  // }

  public Card[] getHandCards() {
    return this.handCards;
  }

  public String[] showAllHandCards() {
    String[] str = new String[this.handCards.length];
    for(int i = 0; i < this.handCards.length; i++) {
      str[i] = this.handCards[i].toString();
    }
    return str;
  }

  public Card[] sort() {
    List<Card>() = new ArrayList<>();
    for (Card c : this.cards) {
      ArrayList.add(c);
    }
    Collections.sort(c, new IncreasingOrder());

  }



  // public String showCard() {
  //   for (Card c : )
  //   return System.out.println(Arrays.toString(this.handCards));
  // }


}
