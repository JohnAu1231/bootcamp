public enum Sign {
  
  DEBIT(-1), //
  CREDIT(1), //
  ;

  private int value;

  private Sign(int value) {
    this.value = value;
  }

  public int getSignValue() {
    return this.value;
  }
}
