package poker;

import java.util.Arrays;
import java.util.Scanner;

public class BigTwo {
  
  private Player[] playerList;

  private Deck bigTwoDeck;

  private int round;

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

  public void setPlayer(Player player, int num) {
    this.playerList[num] = player;
  }

  public Player[] getPlayerList() {
    return this.playerList;
  }

  // public void setHandCard(Card[] card) {
  //   this.handCard = card;
  // }

  public void setDeck(Deck deck) {
    this.bigTwoDeck = deck;
  }

  public Deck getDeck() {
    return this.bigTwoDeck;
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

  // who play
  public Player whoPlay() {
    for(Player p : this.playerList) {
      if( p.isGetDiamond3() == true) {
        return p;
      }
    }
    return null;
  }



  public static void main(String[] args) {
        // rule choose
    // Scanner bigTwo = new Scanner(System.in);
    Player[] playerList = new Player[] {new Player("John"), new Player("Plyaer2"), new Player("Player3"), new Player("Player4")};
    Player player1 = playerList[0];
    Player player2 = playerList[1];
    Player player3 = playerList[2];
    Player player4 = playerList[3];
    BigTwo game = new BigTwo(playerList);
    // System.out.print("Please enter your name:");
    // String input = bigTwo.next();
    // player1.setName(input);

    ShuffleHelper shuff = new ShuffleHelper(game.getDeck());
    // shuffle
    shuff.shuffle();
     // deal
    Deal deal = new Deal(shuff.getCards());
    deal.dealOneToEach(4,13);
    // player1.setPlayerHandCard.setHandCard(deal.getCards(1));
      // get handcard
    HandCard hand = new HandCard(deal.getCards(1));
    HandCard hand2 = new HandCard(deal.getCards(1));
    HandCard hand3 = new HandCard(deal.getCards(1));
    HandCard hand4 = new HandCard(deal.getCards(1));
    player1.setPlayerHandCard(hand);
    player2.setPlayerHandCard(hand2);
    player3.setPlayerHandCard(hand3);
    player4.setPlayerHandCard(hand4);
    System.out.println(Arrays.toString(player1.getHandCard().showAllHandCards()));
    // diamond 3 detect
    game.whoPlay();
    // player flow declare
    
    // 1round
    // AI logic
    // outside card type
    // detect canplay?
    // player play 
    // detect canplay?
    // player play or pass
    
    // handcard empty = win
    

    



  }
}
