package GlobalSales;

import java.math.BigDecimal;

public class Shoe {

  private double price;
  
  private int salesVolume;

  private String name;

  public Shoe(String name, int salesVolume) {
    this.name = name;
    this.price = 39.9d;
    this. salesVolume = salesVolume;
  }

  public double subTotal() {
    return BigDecimal.valueOf(this.price) //
    .multiply(BigDecimal.valueOf(this.salesVolume)) //
    .doubleValue();
  }

  public String toString() {
    return "Shoe(" //
    + "name=" + this.name //
    + ", price=" + this.price //
    + ", salesVolume=" + this.salesVolume //
    + ")";
  }
}
