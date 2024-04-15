package poker;

import java.util.Scanner;

public class BigTwo {
  
  private Player[] playerList;

  private Deck bigTwoDeck;

  public BigTwo(Player[] playerList) {
    this.playerList = playerList;
    this.bigTwoDeck = Deck.full();
  }

  public void setPlayerNum(int playerNum) {
    this.playerList = new Player[4];
  }

  public void setPlayer(Player[] playerList) {
    this.playerList = playerList;
  }

  public void setHandCard(Card[] card) {
    this.handCard = card;
  }

  public void setDeck(Deck deck) {
    this.bigTwoDeck = deck;
  }

  

  //instance block
  
  public static int bigTwoCompareTo(Card hanCard, Card targetCard) {
    //reinitializtion
    int hNum = hanCard.getRank().getRankValue();
    int tNum = targetCard.getRank().getRankValue();
    if (hNum == 1) {
      hNum = 14;
    } else if(hNum == 2) {
      hNum = 15;
    }
    if (tNum == 1) {
      tNum = 14;
    } else if (tNum == 2) {
      tNum = 15;
    }
    //compare rank
    if (hNum > tNum) {
      return 1;
    } else if (hNum < tNum) {
      return -1;
    }
    //compare suit when rank is same
    return Rule.suitCompareTo(hanCard, targetCard);
  }

  public static void main(String[] args) {
    Scanner bigTwo = new Scanner(System.in);
    Player[] playerlist = new Player[] {new Player("John",new HandCard())}
    BigTwo(new Player[] { User, new Player Player2});
    System.out.print("Pleaseplayer1 name:")
  }
}
