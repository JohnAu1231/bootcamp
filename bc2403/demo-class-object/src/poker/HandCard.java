package poker;

import java.util.Arrays;

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



  // public String showCard() {
  //   for (Card c : )
  //   return System.out.println(Arrays.toString(this.handCards));
  // }


}
