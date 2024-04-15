package poker;

//limit the vaule
public enum Suit {
  DIAMOND(1, 'D'), //
  CLUB(2, 'C'), //
  HEART(3, 'H'), //
  SPADE(4, 'S');

  private int value;

  private char firstChar;

  private Suit(int value, char firstChar) {
    this.value = value;
    this.firstChar = firstChar;
  }

  public int getValue() {
    return value;
  }

  public char getFitstChar() {
    return firstChar;
  }
}
