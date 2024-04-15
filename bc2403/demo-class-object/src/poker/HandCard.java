package poker;

public class HandCard {
  

  private Card[] handCards;


  // public void setPlayer(Player player) {
  //   this.player = player;
  // }

  public void setHandCard(Card[] handCards) {
    this.handCards = handCards;
  }

  // public Player getHandCardPlayer() {
  //   return this.player;
  // }

  public Card[] getHandCards() {
    return this.handCards;
  }
}
