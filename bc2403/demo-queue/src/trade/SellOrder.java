package trade;

import java.util.Comparator;

public class SellOrder implements Comparator<Sell>{

  @Override
  public int compare(Sell s1, Sell s2) {
    if (s1.getPrice() < s2.getPrice())
      return -1;
    return 1;
  }
}
