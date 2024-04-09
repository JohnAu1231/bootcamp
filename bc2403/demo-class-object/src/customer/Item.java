package customer;

import java.math.BigDecimal;

public class Item {

  private String desc; // description

  private double price;

  private int quantity;

  public Item() {}

  public Item(String desc, double price, int quantity) {
    this.desc = desc;
    this.price = price;
    this.quantity = quantity;
  }

  public double subTotal() {
    return BigDecimal.valueOf(this.price)//
    .multiply(BigDecimal.valueOf(this.quantity))//
    .doubleValue();
    
  }

  public String toString() {
    return "Item(" //
        + "desc=" + desc //
        + ", price=" + price //
        + ", quantity =" + quantity //
        + ")";
  }

  public static void main(String[] args) {
    Item item1 = new Item("apple", 20, 5);
    System.out.println(item1.subTotal());
    Item item2 = new Item("ornage", 5.0, 2);
    System.out.println(item2.subTotal());
    Item[] items = new Item[] {item1, item2};
    // Item[] items = new Item[2];
    // items[0] = item1;
    // items[1] = item2;

    Order order1 = new Order("order001");
    // Order[] orders = new Order[2];
    order1.add(item1);
    System.out.println(order1);
    order1.add(item2);
    System.out.println(order1);
    Order order2 = new Order("order002");
    order2.add(item2);
    order2.add(item1);

    // Order order1 = new Order("order001", items);
    // Order order2 = new Order("order002");
    // Order[] orders = new Order[] {order1, order2};
    Order[] orders = new Order[2];
    orders[0] = order1;
    orders[1] = order2;
    System.out.println(order1.total());

    // orders[1] = order2;
    Customer c = new Customer("sallychan");
    c.add(order1);
    c.add(order2);
    System.out.println(c);
    System.out.println(c.total());

  }
}
