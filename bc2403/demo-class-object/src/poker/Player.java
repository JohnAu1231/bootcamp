package poker;

public class Player {

private HandCard handCards;

private Hand hand;

private String name;

public Player(String name) {
  this.name = name;
  // this.handCards = handcards;
}

public void setPlayerHand(Hand hand) {
  this.hand = hand;
}

public void setPlayerHand(Card[] cards) {
  this.hand = new Hand(cards);
}

public void setPlayerHandCard(HandCard handCards) {
  this.handCards = handCards;
}

public void setName(String name) {
  this.name = name;
}
public HandCard getHandCard() {
  return this.handCards;
}


public Hand getPlayerHand() {
  return this.hand;
}

public void addCard(Card card) {
  Card[] newArr = new Card[this.handCards.getHandCards().length + 1];
  newArr[this.handCards.getHandCards().length] = card;
  for (int i = 0; i < this.handCards.getHandCards().length; i++) {
    newArr[i] = this.handCards.getHandCards()[i];
  }
}

public Card play(int num) {
  Card temp = this.handCards.getHandCards()[num];
  Card[] newArr = new Card[this.handCards.getHandCards().length -1 ];
  int idx = 0;
  for (int i = 0; i < this.handCards.getHandCards().length; i++) {
    if (i == num) {
      continue;
    }
    newArr[idx++] = this.handCards.getHandCards()[i];
  }
  return temp;
}

// public boolean isGreater(Hand hand) {
//   if(this.hand.isStraightFlush() == hand.isStraightFlush()) {
//     this.hand.isGreaterStraightFlush(hand);
//   } else if (this.hand.isStraightFlush()) {
//     return true;
//   } else if (hand.isStraightFlush()) {
//     return false;
//   }
// }

public boolean isGetDiamond3() {
  for(Card c : this.handCards.getHandCards()) {
    if (c.getRank() == Rank.THREE && c.getSuit() == Suit.DIAMOND)
      return true;
  }
  return false;
}
  //洗牌
  //手牌數
}
