package GlobalSales;

import java.math.BigDecimal;
import java.util.Arrays;

public class Shop{

  private String location;

  private Shoe[] shoes;

  public Shop(String location) {
    this.location = location;
    this.shoes = new Shoe[0];
  }

  public void addShoe(Shoe shoe) {
    Shoe[] copyArr = this.shoes;
    this.shoes = new Shoe[this.shoes.length + 1];
    for (int i = 0; i < copyArr.length; i++) {
      this.shoes[i] = copyArr[i];
    }
    this.shoes[this.shoes.length - 1] = shoe;
  }

  public double shopSale() {
    BigDecimal sum = BigDecimal.valueOf(0);
    for (int i = 0; i < this.shoes.length; i++) {
      sum = sum.add(BigDecimal.valueOf(this.shoes[i].subTotal()));
    }
    return sum.doubleValue();
  }

  public String toString() {
    return "Shop(" //
    + "location=" + this.location //
    + ", shoes=" + Arrays.toString(this.shoes) // 
    + ")";
  }




}