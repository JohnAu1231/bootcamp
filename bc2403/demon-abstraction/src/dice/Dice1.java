package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice1 implements Roll{
  
  private final Color[] colors = {Color.RED, Color.BLACK, Color.BLUE, Color.PINK, Color.WHITE, Color.YELLOW};

  public Color[] getColors() {
    return this.colors;
  }

  @Override
  public String toString() {
    return "Dice1(" //
          +"colors=" + Arrays.toString(this.getColors())
          + ")";
  }
  @Override
  public int roll() {
    int idx = new Random().nextInt(6);
    return this.colors[idx].getValue();
  }

  public Color roll2() {
    int idx = new Random().nextInt(6);
    return this.colors[idx];
  }

  public static void main(String[] args) {
    
  }
}
