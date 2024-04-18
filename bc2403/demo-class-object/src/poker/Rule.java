package poker;

public class Rule {

  // Design single card

  // instance method: card.compareTo(Card card) -> 1,0,-1


  // static method: compareTo(Card c1, Card c2) //-> 1,0,-1


  public static int compareTo(Card hanCard, Card targetCard) {

    if (hanCard.getRank().getRankValue() > targetCard.getRank()
        .getRankValue()) {
      return 1;
    } else if (hanCard.getRank().getRankValue() < targetCard.getRank()
        .getRankValue()) {
      return -1;
    }
    return suitCompareTo(hanCard, targetCard);
  }

  public static boolean isGreater(Card playCard, Card targetCard) {
    if (playCard.getRank().getRankValue() > targetCard.getRank()
        .getRankValue()) {
      return true;
    } else if (playCard.getRank().getRankValue() < targetCard.getRank()
        .getRankValue()) {
      return false;
    } else if (playCard.getRank() == targetCard.getRank()) {
      if (playCard.getSuit().getValue() > targetCard.getSuit().getValue()) {
        return true;
      } else if (!(playCard.getSuit().getValue() > targetCard.getSuit()
          .getValue())) {
        return false;
      }
    }
    return false;
  }


  public static int bigTwoCompareTo(Card playCard, Card targetCard) {
    // reinitializtion
    int hNum = playCard.getRank().getRankValue();
    int tNum = targetCard.getRank().getRankValue();
    if (hNum == 1) {
      hNum = 14;
    } else if (hNum == 2) {
      hNum = 15;
    }
    if (tNum == 1) {
      tNum = 14;
    } else if (tNum == 2) {
      tNum = 15;
    }
    // compare rank
    if (hNum > tNum) {
      return 1;
    } else if (hNum < tNum) {
      return -1;
    }
    // compare suit when rank is same
    return suitCompareTo(playCard, targetCard);
  }


  public static int suitCompareTo(Card handCard, Card targetCard) {
    int tNum = 0;
    int hNum = 0;
    if (targetCard.getSuit() == Suit.SPADE)
      tNum = 4;
    if (targetCard.getSuit() == Suit.HEART)
      tNum = 3;
    if (targetCard.getSuit() == Suit.CLUB)
      tNum = 2;
    if (targetCard.getSuit() == Suit.DIAMOND)
      tNum = 1;
    if (handCard.getSuit() == Suit.SPADE)
      tNum = 4;
    if (handCard.getSuit() == Suit.HEART)
      tNum = 3;
    if (handCard.getSuit() == Suit.CLUB)
      tNum = 2;
    if (handCard.getSuit() == Suit.DIAMOND)
      tNum = 1;
    if (hNum > tNum) {
      return 1;
    } else if (hNum < tNum) {
      return -1;
    } else {
      return 0;
    }
  }

  public static void sort(Card[] cards) {
    int idx = 0;
    for(int i = 1 ; i < cards.length ; i++) {
      Card key = cards[i];
      idx = i - 1;
      while ((idx >= 0 && cards[idx].getRank().getRankValue() > key.getRank().getRankValue()) || 
       (idx >= 0 && cards[idx].getRank().getRankValue() == key.getRank().getRankValue() 
       && cards[idx].getSuit().getValue() > key.getSuit().getValue())) {
        cards[idx + 1] = cards[idx];
        idx --;
      }
      cards[idx + 1] = key;
      }
    }

    

    }

}
