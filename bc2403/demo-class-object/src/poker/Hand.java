package poker;

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

  public Card[] getCards() {
    return this.cards;
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

  private static boolean isStraight(Card[] cards) {
    int[] arr = new int[13];
    for (int i = 0; i < cards.length; i++) {
      arr[cards[i].getRank() - 1]++;
    }
    for (int i = 0; i < arr.length - 4; i++) {
      if (arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4] == 5) {
        return true;
      }
    }
    return false;
  }

  private static boolean isFlush(Card[] cards) {
    for (int i = 0 ; i < cards.length - 1; i++) {
      if (cards[i].getSuit() != cards[i + 1].getSuit()) {
        return false;
      }
    }
    return true;
  }

  private static boolean isThreeHouse(Card[] cards) {
    int[] arr = new int[13];
    for (int i = 0; i < cards.length; i++) {
      arr[cards[i].getRank() - 1]++;
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
      arr[cards[i].getRank() - 1]++;
    }
    for (int i : arr) {
      if (i == 4)
        return true;
    }
    // main logic
    return false;
  }

  private static boolean isStraightFlush(Card[] cards) {
    if(isStraight(cards) && isFlush(cards)) {
      return true;
    }
    return false;
  }

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

}
