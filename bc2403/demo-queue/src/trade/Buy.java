package trade;

public class Buy {
  
  private double price;

  private int quantity;

  Buy(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public String toString() {
    return "Buy=(" //
          + "price= " + this.price //
          +", quantity= " + this.quantity //
          +")";

  }
}
