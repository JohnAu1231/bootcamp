package poker;

public class Deal {

  private int dealTotalNum;

  private int playerNum;

  private Deck deck;

  public void setDealTotal(int dealTotalNum) {
    this.dealTotalNum = dealTotalNum;
  }

  public void setPlayerNum(int playerNum) {
    this.playerNum = playerNum;
  }

  public void dealOneToEach(int playerNum, int eachNum ) {
    if (this.deck.deckCardNum() % playerNum == 0) {
    Card[][] cardArr = new Card[playerNum][this.deck.deckCardNum()/playerNum];
    for (int i = 0; i < this.deck.deckCardNum(); i++) {
      for (int j = 0; j < playerNum; j++) {
        cardArr[j][i] = this.deck.getCards()[i];
      }
    }
    for (int i = 0; i < cardArr.length; i++) {
      player[i][]
    }
  }
  }

}
