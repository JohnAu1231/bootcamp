package poker;

public class Rule {

  // Design single card

  // instance method: card.compareTo(Card card) -> 1,0,-1


  // static method: compareTo(Card c1, Card c2) //-> 1,0,-1
  public static int compareTo(Card hanCard, Card targetCard) {

    if (hanCard.getRank() > targetCard.getRank()) {
      return 1;
    } else if (hanCard.getRank() < targetCard.getRank()) {
      return -1;
    }
    return suitCompareTo(hanCard, targetCard);
  }

  public static int bigTwoCompareTo(Card hanCard, Card targetCard) {
    //reinitializtion
    int hNum = hanCard.getRank();
    int tNum = targetCard.getRank();
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
    return suitCompareTo(hanCard, targetCard);
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


}
