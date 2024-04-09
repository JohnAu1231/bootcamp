package customer;

import java.util.Arrays;

public class Customer {
  private String userName;
  
  // One Customer has many orders
  private Order[] orders;

  public Customer() {

  }

  public Customer(String userName) {
    this.userName = userName;
    this.orders = new Order[0];
  }
  public void add(Order order) {
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length + 1];
    for (int i = 0; i < copyArr.length; i++) {
      this.orders[i] = copyArr[i];
    }
    this.orders[this.orders.length - 1] = order;
  }
  
  public double total() {
    int sum = 0;
    for(int i = 0; i < this.orders.length; i++) {
      sum += orders[i].total();
    }
    return sum;
  }
  
  public String toString() {
    return "Customer(" //
    + "userName" + this.userName // 
    + ", orders" + Arrays.toString(this.orders) //
    + ")"; //
  }
}
