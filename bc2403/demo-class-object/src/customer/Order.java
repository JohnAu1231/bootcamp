package customer;

import java.util.Arrays;

public class Order {

  private String orderNo;
  
  private Item[] items;

  public Order() {
  }
  public Order(String orderNo) {
    this.orderNo = orderNo;
    this.items = new Item[0];
  }

  public void add(Item item) {
    Item[] copyArr = this.items;
    this.items = new Item[this.items.length + 1];
    for(int i = 0; i < copyArr.length;i++) {
      this.items[i] = copyArr[i];
    }
    this.items[this.items.length - 1] = item;
  }

  public double total() {
    double sum = 0;
    for(int i = 0; i < this.items.length; i++) {
      sum += items[i].subTotal();
    }
    return sum;
  }


  public String toString() {
    return "Order(" //
    + "orderNo=" + orderNo //
    + ", items=" + Arrays.toString(items) //
    + ")";
  }
}
