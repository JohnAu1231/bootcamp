package poker;

import java.util.Comparator;

public class DecreasingOrder implements Comparator<Card>{

  public int compare(Card c1, Card c2) {
    if (c1.getRank().getRankValue() > c2.getRank().getRankValue()) 
      return -1;
    else if (c1.getRank().getRankValue() < c2.getRank().getRankValue())
      return 1;
    if (c1.getSuit().getValue() > c2.getSuit().getValue())
      return -1;
    return 1;

  }
  
}
