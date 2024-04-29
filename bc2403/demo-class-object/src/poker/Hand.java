package poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {

  private Card[] cards;

  public Hand(Card a, Card b, Card c, Card d, Card e) {
    if (a == null || b == null || c == null || d == null || e == null)
      throw new IllegalArgumentException();
    this.cards = new Card[5];
    this.cards[0] = a;
    this.cards[1] = b;
    this.cards[2] = c;
    this.cards[3] = d;
    this.cards[4] = e;

  }

  public Hand(Card[] cards) {
    this.cards = cards;
  }

  public void setHand(Card a, Card b, Card c, Card d, Card e) {
    if (a == null || b == null || c == null || d == null || e == null)
      throw new IllegalArgumentException();
    this.cards = new Card[5];
    this.cards[0] = a;
    this.cards[1] = b;
    this.cards[2] = c;
    this.cards[3] = d;
    this.cards[4] = e;

  }

  public void setHand(Card[] cards) {
    this.cards = cards;
  }

  public Card[] getCards() {
    return this.cards;
  }

  public Card getCard(int num) {
    if (num < this.cards.length)
      return this.cards[num];
    return null;
  }

  public Card[] sort() {
    List<Card> ls = new ArrayList<>();
    for (Card c : this.cards) {
      ls.add(c);
    }
    Collections.sort(ls, new IncreasingOrder());
    return (Card[])ls.toArray();
    // Card[] arr = new Card[ls.size()];
    // for (int i = 0; i < ls.size(); i++) {
    //   arr[i] = ls.get(i);
    // }
  //   Card[] cards = new Card[ls.size()];
  //   cards = ls.toArray(cards);
  //   return cards;
  // }
  }

  public boolean isStraight() {
    return isStraight(this.cards);
  }

  public boolean isFlush() {
    return isFlush(this.cards);
  }

  public boolean isThreeHouse() {
    return isThreeHouse(this.cards);
  }

  public boolean isFourKind() {
    return isFourKind(this.cards);
  }

  public boolean isStraightFlush() {
    return isStraightFlush(this.cards);
  }


  public boolean isGreater(Card targeCard) {
    return isGreater(this.cards[0], targeCard);
  }

  public boolean isGreaterPair(Card tarCard) {
    return isGreater(this.cards[1],tarCard);
  }

  public boolean isGreaterThree(Card tarCard) {
    return isGreater(this.cards[2],tarCard);
  }

  public boolean isGreaterFour(Card tarCard) {
    return isGreater(this.cards[3],tarCard);
  }


  public boolean isGreaterStraight(Card[] targetCards) {
    return isGreaterStraight(this.cards, targetCards);
  }
  
  public boolean isGreaterFlush(Card[] targetCards) {
    return isGreaterStraight(this.cards, targetCards);
  }

  public boolean isGreaterStraightFlush(Card[] targetCards) {
    return isGreaterStraight(this.cards, targetCards);
  }

  public String[] showAllHandCards() {
    String[] str = new String[this.cards.length];
    for(int i = 0; i < this.cards.length; i++) {
      str[i] = this.cards[i].toString();
    }
    return str;
  }

  private static boolean isStraight(Card[] cards) {
    int[] arr = new int[13];
    for (int i = 0; i < cards.length; i++) {
      arr[cards[i].getRank().getRankValue() - 1]++;
    }
    for (int i = 0; i < arr.length - 4; i++) {
      if (arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4] == 5) {
        return true;
      }
    }
    return false;
  }

  private static boolean isFlush(Card[] cards) {
    for (int i = 0; i < cards.length - 1; i++) {
      if (cards[i].getSuit() != cards[i + 1].getSuit()) {
        return false;
      }
    }
    return true;
  }

  private static boolean isThreeHouse(Card[] cards) {
    int[] arr = new int[13];
    for (int i = 0; i < cards.length; i++) {
      arr[cards[i].getRank().getRankValue() - 1]++;
    }
    int count3 = 0;
    int count2 = 0;
    for (int i : arr) {
      if (i == 3) {
        count3++;
      } else if (i == 2) {
        count2++;
      }
      if (count3 == 1 && count2 == 1) {
        return true;
      }
    }
    return false;
  }

  private static boolean isFourKind(Card[] cards) {
    // Early Return False
    if (cards.length != 5)
      return false;
    int[] arr = new int[13]; // 0 12
    for (int i = 0; i < cards.length; i++) {
      arr[cards[i].getRank().getRankValue() - 1]++;
    }
    for (int i : arr) {
      if (i == 4)
        return true;
    }
    // main logic
    return false;
  }

  private static boolean isStraightFlush(Card[] cards) {
    if (isStraight(cards) && isFlush(cards)) {
      return true;
    }
    return false;
  }

  

  // private static type compare
  private static boolean isBig2GreaterStraight(Card[] playCards, Card[] targetCards ) {
    if (playCards[0].getRank() == Rank.ONE && targetCards[0].getRank() != Rank.ONE) {
      return true;
    } else if((playCards[0].getRank() != Rank.ONE && targetCards[0].getRank() == Rank.ONE)) {
     return false;
    } else if((playCards[0].getRank() == Rank.ONE && targetCards[0].getRank() == Rank.ONE)) {
      if (playCards[0].getSuit().getValue() > targetCards[0].getSuit().getValue()) {
        return true;
      } else if (playCards[0].getSuit().getValue() < targetCards[0].getSuit().getValue())
        return false;
    }
  return false;
  }

  private static boolean isGreater(Card playCards, Card targetCards) {
    if (playCards.getRank().getRankValue() >  targetCards.getRank().getRankValue()) {
      return true;
    } else if(playCards.getRank().getRankValue() < targetCards.getRank().getRankValue()) {
     return false;
    } else if(playCards.getRank() == targetCards.getRank()) {
      if (playCards.getSuit().getValue() > targetCards.getSuit().getValue()) {
        return true;
      } else if (playCards.getSuit().getValue() < targetCards.getSuit().getValue()){
        return false; }
      }
      return false;
  }

  private static boolean isGreaterPair(Card[] playCards, Card[] targetCards) {
    return (isGreater(playCards[1], targetCards[1]));
    }

  private static boolean isGreaterThree(Card[] playCards, Card[] targetCards) {
    return (isGreater(playCards[2], targetCards[2]));
  }
  private static boolean isGreaterFour(Card[] playCards, Card[] targetCards) {
    return (isGreater(playCards[3], targetCards[3]));
  }

  private static boolean isGreaterStraight(Card[] playCards, Card[] targetCards ) {
    if (playCards[4].getRank().getRankValue() >  targetCards[4].getRank().getRankValue()) {
      return true;
    } else if(playCards[4].getRank().getRankValue() < targetCards[4].getRank().getRankValue()) {
     return false;
    } else if(playCards[4].getRank() == targetCards[4].getRank()) {
      if (playCards[4].getSuit().getValue() > targetCards[4].getSuit().getValue()) {
        return true;
      } else if (playCards[4].getSuit().getValue() < targetCards[4].getSuit().getValue()){
        return false; }
      }
  return false;
  }
  
  private static boolean isGreaterThreeHouse(Card[] playCards, Card[] targetCards) {
   return isGreaterStraight(playCards, targetCards);
  }
  // private static boolean isGreaterFlush(Card[] playCards, Card[] targrtCards) {
  //   return false;
  // }

  // private static boolean isGreaterStraightFlush(Card[] cards) {
  //   return false;
  // }
  
  //static type compare
  public static boolean isGreaterStraight(Hand myHand, Hand targrtHand) {
    return isGreaterStraight(myHand.getCards(), targrtHand.getCards());
  }

  public static boolean isGreaterFlush(Hand myHand, Hand targetHand) {
    return isGreaterStraight(myHand.getCards(), targetHand.getCards());
  }

  public static boolean isGreaterStraightFlush(Hand myHand, Hand targetHand) {
    return isGreaterStraight(myHand.getCards(), targetHand.getCards());
  }

  // static isType
  public static boolean isStraight(Hand hand) {
    return isStraight(hand.getCards());
  }

  public static boolean isFlush(Hand hand) {
    return isFlush(hand.getCards());
  }

  public static boolean isThreeHouse(Hand hand) {
    return isThreeHouse(hand.getCards());
  }

  public static boolean isFourKind(Hand hand) {
    return isFourKind(hand.getCards());
  }

  public static boolean isStraightFlush(Hand hand) {
    return isStraightFlush(hand.getCards());
  }

  public static boolean isGreater(Hand play, Hand target) {
    if(isStraightFlush(play.getCards()) == true) {
      if(isStraightFlush(target.getCards()) == false)
        return true;
      else if (isGreaterStraightFlush(play, target) == true)  
        return true;
        else
        return false;
    }
    if (isFourKind(play.getCards()) == true) {
      if (isFourKind(target.getCards()) == false)
        return true;
      else if (isFourKind(target.getCards()) == true) {
        if (isGreater(play, target) == true) 
          return true;
        else 
          return false;
      }
    } else if(isFourKind(play.getCards()) == false){
        if (isFourKind(target.getCards()) == true)
          return false;
    }
    if(isFourKind(play.getCards()) == true && isFourKind(target.cards) ==false)
      return true;
    return false;
  }
}
