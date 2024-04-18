package poker;

import java.util.Arrays;

public class Deal {

  private int dealTotalNum;

  private int playerNum;

  private Deck deck;

  private Card[] cards;

  private Card[][] dealCard;

  public Deal(Card[] card) {
    this.cards = card;
  }

  public void setDealTotal(int dealTotalNum) {
    this.dealTotalNum = dealTotalNum;
  }

  public void setPlayerNum(int playerNum) {
    this.playerNum = playerNum;
  }

  public Card[][] getDealCard() {
    return this.dealCard;
  }

  public Card[] getCards(int num) {
    if (num < this.dealCard.length + 1)
      return dealCard[num - 1];
    return null;
  }


  public void dealOneToEach(int playerNum, int eachTotal) {
    if (this.cards.length >= playerNum * eachTotal) {
      Card[][] cardArr = new Card[playerNum][eachTotal];
      int idx = 0;
      for (int i = 0; i < eachTotal; i++) {
        for (int j = 0; j < playerNum; j++) {
          cardArr[j][i] = this.cards[idx++];
        }
      }
      this.dealCard = cardArr;
      System.out.println("dealing");


    }


  }


  public static void main(String[] args) {
    Deck deck1 = Deck.full();
    System.out.println(Arrays.toString(deck1.getCards()));
    Deal deal1 = new Deal(deck1.getCards());
    deal1.dealOneToEach(4, 13);
    System.out.println(Arrays.toString(deal1.getCards(1)));
  }
}
