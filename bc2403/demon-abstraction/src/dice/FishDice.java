package dice;

import java.util.Arrays;
import java.util.Random;

public class FishDice implements Roll{
  
  private Fish[] fishes = {Fish.CRAB, Fish.FISH, Fish.PRWAN};

    public Fish[] getFishes() {
    return this.fishes;
  }

  @Override
  public String toString() {
    return "FishDice(" //
          +"Fish=" + Arrays.toString(this.getFishes())
          + ")";
  }

  @Override
    public int roll() {
    int idx = new Random().nextInt(3);
    return this.fishes[idx].getValue();
  }
  public Fish roll2() {
    int idx = new Random().nextInt(3);
    return this.fishes[idx];
  }
}
