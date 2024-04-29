package trade;

import java.util.Comparator;

public class BuyOrder implements Comparator<Buy>{

  @Override
  public int compare(Buy b1, Buy b2) {
    if (b1.getPrice() > b2.getPrice())
      return -1;
    return 1;
  }
  
}
