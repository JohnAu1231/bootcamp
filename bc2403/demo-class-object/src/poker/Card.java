package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Card{

  // when no enum, using static final
  // public static final char DIAMOND = 'D';
  // public static final char HEART = 'H';
  // public static final char SPADE = 'S';
  // public static final char CLUB = 'C';
  // public static final int ONE = 1;
  // public static final int TWO = 2;
  // public static final int THREE = 3;
  // public static final int FOUR = 4;
  // public static final int FIVE = 5;
  // public static final int SIX = 6;
  // public static final int SEVEN = 7;
  // public static final int EIGHT = 8;
  // public static final int NINE = 9;
  // public static final int TEN = 10;
  // public static final int ELEVEN = 11;
  // public static final int TWLVE = 12;
  // public static final int Rank.THIRTEEN = 13;
  // instance variable
  private Suit suit;

  private Rank rank;

  // constructor
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public void setCard(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public int suitCompareTo(Card card) {
    int thisC = 0;
    int compareC = 0;
    if (this.suit == Suit.SPADE) {
      thisC = 4;
    }
    if (this.suit == Suit.HEART) {
      thisC = 3;
    }
    if (this.suit == Suit.CLUB) {
      thisC = 2;
    }
    if (this.suit == Suit.DIAMOND) {
      thisC = 1;
    }
    if (card.getSuit() == Suit.SPADE) {
      compareC = 4;
    }
    if (card.getSuit() == Suit.HEART) {
      compareC = 3;
    }
    if (card.getSuit() == Suit.CLUB) {
      compareC = 2;
    }
    if (card.getSuit() == Suit.DIAMOND) {
      compareC = 1;
    }
    if (thisC > compareC) {
      return 1;
    } else if (thisC < compareC) {
      return -1;
    }
    return 0;
  }

  public int compareTo(Card card) {
    if (this.rank.getRankValue() > card.rank.getRankValue()) {
      return 1;
    } else if (this.rank.getRankValue() < card.rank.getRankValue()) {
      return -1;
    }
    return this.suitCompareTo(card);
  }
  

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ", suit=" + this.suit //
        + ")";
  }

  public static void main(String[] args) {
    System.out.println("hello");
    Card hello = new Card(Rank.ONE, Suit.DIAMOND);
    Card world = new Card(Rank.TWO, Suit.SPADE);
    // System.out.println(hello.getRank());
    // System.out.println(world.getRank());
    // System.out.println(world.getSuit());
    // System.out.println(world.compareTo(hello));
    // System.out.println(Rule.compareTo(world,hello));
    // System.out.println(Rule.compareTo(hello,world));
    Card[] card1 = new Card[] {new Card(Rank.THIRTEEN, Suit.SPADE),
        new Card(Rank.TWO, Suit.SPADE), new Card(Rank.TWO, Suit.SPADE),
        new Card(Rank.TWO, Suit.SPADE), new Card(Rank.ONE, Suit.SPADE)};
    Card c1 = new Card(Rank.THIRTEEN, Suit.SPADE);
    Card c2 = new Card(Rank.TWLVE, Suit.SPADE);
    Card c3 = new Card(Rank.ELEVEN, Suit.SPADE);
    Card c4 = new Card(Rank.TEN, Suit.DIAMOND);
    Card c5 = new Card(Rank.NINE, Suit.SPADE);
    Hand myHand = new Hand(new Card(Rank.THIRTEEN, Suit.SPADE),
        new Card(Rank.TWO, Suit.SPADE), new Card(Rank.TWO, Suit.SPADE),
        new Card(Rank.TWO, Suit.SPADE), new Card(Rank.TWO, Suit.SPADE));
    Hand myHand2 = new Hand(new Card(Rank.SIX, Suit.SPADE),
        new Card(Rank.FIVE, Suit.SPADE), new Card(Rank.FOUR, Suit.SPADE),
        new Card(Rank.THREE, Suit.SPADE), new Card(Rank.TWO, Suit.SPADE));
    Hand myHand3 = new Hand(c1, c3, c5, c2, c4);
    Hand myHand4 = new Hand(new Card(Rank.SIX, Suit.DIAMOND),
        new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.FOUR, Suit.DIAMOND),
        new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.TWO, Suit.DIAMOND));
    System.out.println(myHand.isFourKind());
    System.out.println(myHand.isThreeHouse());
    System.out.println(myHand2.isFlush());
    System.out.println(myHand2.isStraight());
    System.out.println(myHand3.isStraight());
    System.out.println(myHand2.isStraightFlush());
    System.out.println(myHand3.isStraightFlush());
    System.out.println("Bigger straight=" + myHand4.isGreaterStraight(myHand2.getCards()));

    HandCard hand1 = new HandCard(card1);
    hand1.setHandCard(card1);
    System.out.println(Arrays.toString(hand1.showAllHandCards()));

    int random = new Random().nextInt(2);
    Comparator<Card> formula = null;
    if (random == 0)
      formula = new DecreasingOrder();
    else if (random == 1)
      formula = new IncreasingOrder();
    List<Card> ls = new ArrayList<>();
    ls.add(new Card(Rank.FIVE, Suit.DIAMOND));
    ls.add(new Card(Rank.FOUR, Suit.DIAMOND));
    ls.add(new Card(Rank.FOUR, Suit.SPADE));
    ls.add(new Card(Rank.THREE, Suit.HEART)); 
    ls.add(new Card(Rank.TWO, Suit.DIAMOND));
    // Collections.sort(ls, formula);
    Collections.sort(ls, new IncreasingOrder());
    System.out.println(random);
    System.out.println(ls);

    Hand myHand5 = new Hand(new Card(Rank.FOUR, Suit.DIAMOND),
        new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.FOUR, Suit.HEART),
        new Card(Rank.THREE, Suit.HEART), new Card(Rank.TWO, Suit.DIAMOND));
    System.out.println(Arrays.toString(myHand5.showAllHandCards()));
    System.out.println(Arrays.toString(myHand5.sort()));



  }


}
