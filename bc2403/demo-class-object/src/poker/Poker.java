package poker;

import java.util.Arrays;

public class Poker {
  
  private Player[] players;

  private int round;

  // public void setPlayer(int playerNum) {
  //   this.players = new Player[playerNum];
  // }

  public static void main(String[] args) {
    
   
    Player User = new Player("You");
    Player aiPlayer = new Player("AI Player");
    Player[] playerList = new Player[] {User,aiPlayer};
    Deck pokerDeck = Deck.full();
    ShuffleHelper shuff = new ShuffleHelper(pokerDeck);
    shuff.riffle();
    shuff.riffle();
    shuff.riffle();
    shuff.riffle();
    shuff.riffle();
    shuff.riffle();
    shuff.riffle();
    shuff.shuffle();
    shuff.shuffle();
    shuff.shuffle();
    shuff.shuffle();
    shuff.shuffle();
    Deal deal = new Deal(shuff.getCards());
    deal.dealOneToEach(2, 5);
    User.setPlayerHand(deal.getCards(1));
    aiPlayer.setPlayerHand(deal.getCards(2));
    System.out.println(Arrays.toString(User.getPlayerHand().showAllHandCards()));
    System.out.println(Arrays.toString(aiPlayer.getPlayerHand().showAllHandCards()));
    User.getPlayerHand().isStraightFlush();
   
    

  }
}
