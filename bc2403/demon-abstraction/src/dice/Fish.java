package dice;

public enum Fish {
  FISH(1), //
  CRAB(2), //
  PRWAN(3) ;

  private int value;

  private Fish(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
  

}
