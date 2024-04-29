public class IntegerPrinter {
  private Integer data;

  public IntegerPrinter(Integer i) {
    this.data = i;
  }

  public void setData(Integer i) {
    this.data = i;
  }
  
  public void print() {
    System.out.println(this.data);
  }

  public String toString() {
    return "IntegerPrinter=" //
          + "data=" + data //
          + ")";
  }
}
