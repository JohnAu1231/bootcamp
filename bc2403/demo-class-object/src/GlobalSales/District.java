package GlobalSales;

import java.math.BigDecimal;
import java.util.Arrays;

public class District {

  private Shop[] shops;

  private String districtName;

  public District() {
    this.districtName = "Hong Kong";
    this.shops = new Shop[0];
  }

  public double districtSale() {
    BigDecimal sum = BigDecimal.valueOf(0);
    for (int i = 0; i < this.shops.length; i++) {
      sum = sum.add(BigDecimal.valueOf(this.shops[i].shopSale()));
    }
    return sum.doubleValue();
  }

  public void addShop(Shop shop) {
    Shop[] copyArr = this.shops;
    this.shops = new Shop[this.shops.length + 1];
    for (int i = 0; i < copyArr.length; i++) {
      this.shops[i] = copyArr[i];
    }
    this.shops[this.shops.length - 1] = shop;
  }

  public String toString() {
    return "District(" //
    + "districtName=" + this.districtName //
    + ", shops=" + Arrays.toString(this.shops) // 
    + ")";
  }


  public static void main(String[] args) {
    Shoe shoe1 = new Shoe("ultraBoost", 1000);
    Shoe shoe2 = new Shoe("superStar", 800);
    Shoe shoe3 = new Shoe("stanSmith", 900);
    System.out.println(shoe1.subTotal());
    System.out.println(shoe2.subTotal());
    System.out.println(shoe1.toString());
    System.out.println(shoe1.toString());
    Shop shop1 = new Shop("kowloonBay");
    shop1.addShoe(shoe1);
    shop1.addShoe(shoe2);
    Shop shop2 = new Shop("tseungKwanO");
    shop2.addShoe(shoe2);
    shop2.addShoe(shoe3);
    System.out.println(shop1.toString());
    System.out.println(shop2.toString());
    District hk = new District();
    hk.addShop(shop1);
    hk.addShop(shop2);
    System.out.println(hk.toString());
    System.out.println(hk.districtSale());


  }
}
