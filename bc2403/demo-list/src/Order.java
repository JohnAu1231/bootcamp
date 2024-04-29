import java.util.Objects;

public class Order {
  
  private int amount; 

  public Order(int amount) {
      this.amount = amount;
  }

  public int getAmount() {
    return this.amount;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Order))
      return false;
    Order ord = (Order) obj;
    return Objects.equals(this.amount, ord.getAmount());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.amount);
  }

  @Override
  public String toString() {
    return "Order(" //
          + "amount=" + this.amount // 
          + ")";
  }
}
