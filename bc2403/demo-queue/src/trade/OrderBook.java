package trade;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class OrderBook {

  private PriorityQueue<Buy> buy = new PriorityQueue<Buy>(new BuyOrder());

  private PriorityQueue<Sell> sell = new PriorityQueue<Sell>(new SellOrder());

  private double highestBuy = 0;
  private double lowestSell = Double.MAX_VALUE;

  private int highgestBuyQuantity = 0;
  private int lowestSellQuantity = 0;

  public void addBuy(double price, int quantity) {
    this.buy.add(new Buy(price, quantity));
  }

  public void addSell(double price, int quantity) {
    this.sell.add(new Sell(price, quantity));
  }

  public void setHighB(double price) {
    this.highestBuy = price;
  }

  public void setLowS(double price) {
    this.lowestSell = price;
  }

  public void setHighBuyQ(int quantity) {
    this.highgestBuyQuantity = quantity;
  }

  public void setLowSellQ(int qunatity) {
    this.lowestSellQuantity = qunatity;
  }

  public void delBuy() {
    this.buy.poll();
  }

  public void delSell() {
    this.sell.poll();
  }

  public Buy seeBuy() {
    return this.buy.peek();
  }

  public Buy getBuy() {
    return this.buy.poll();
  }

  public Sell seeSell() {
    return this.sell.peek();
  }

  public Sell getSell() {
    return this.sell.poll();
  }

  public double getHighB() {
    return this.highestBuy;
  }

  public double getLowS() {
    return this.lowestSell;
  }

  public int getHighBuyQ() {
    return this.highgestBuyQuantity;
  }

  public int getLowSellQ() {
    return this.lowestSellQuantity;
  }

  public void updateHighB(double price) {
    if (price > this.highestBuy)
      this.highestBuy = price;
    System.out.println("update highb");

  }

  public void updateHighB() {
    Buy temp = this.buy.poll();
    if (temp != null) {
      double price = temp.getPrice();
      this.buy.add(temp);
      setHighB(price);
      System.out.println("update highb(2)");
    }
  }

  public void updateLowS(double price) {
    if (price < this.lowestSell)
      this.lowestSell = price;
    System.out.println("update lowsell");
  }

  public void updateLowS() {
    Sell temp = this.sell.poll();
    if (temp != null) {
      double price = temp.getPrice();
      this.sell.add(temp);
      setLowS(price);
      System.out.println("update lowsell(2)");
    }
  }

  public int updateHighQ() {
    Buy temp = this.buy.poll();
    int qunatity = temp.getQuantity();
    this.buy.add(temp);
    return qunatity;
  }

  public int updateLowQ() {
    Sell temp = this.sell.poll();
    int quantity = temp.getQuantity();
    this.sell.add(temp);
    return quantity;
  }

  public void checkAllBuy() {
    PriorityQueue<Buy> newQ = new PriorityQueue<Buy>(new BuyOrder());
    System.out.println("BuyList:" + this.buy.size());
    int n = this.buy.size();
    for (int i = 0; i < n; i++) {
      Buy temp = this.buy.poll();
      System.out.println("(" + (i + 1) + ")" + temp);
      newQ.add(temp);
    }
    this.buy = newQ;

    System.out.println("-----------------" + this.buy.size());

  }

  public void checkAllSell() {
    PriorityQueue<Sell> newQ = new PriorityQueue<Sell>(new SellOrder());
    System.out.println("SellList");
    int n = this.sell.size();
    for (int i = 0; i < n; i++) {
      Sell temp = this.sell.poll();
      System.out.println("(" + (i + 1) + ")" + temp);
      newQ.add(temp);
    }
    this.sell = newQ;
    System.out.println("-----------------" + this.sell.size());
  }

  private boolean isInRange(double price) {
    if (BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(100)).intValue() % 5 !=0) {
      System.out.println("Out of Range!!! Please set the price be the mulitple of 0.05");
      return false;
    }
    return true;
  }



  // public Boolean canBuy (double price, int quantity) {


  // }

  public void buy(double price, int quantity) {
    if (isInRange(price) != true)
    return;
    System.out.println("-------Buy------");
    System.out.println(" market selling order=" + this.sell.size());
    System.out.println("Order: Price=" + price + "| Quantity=" + quantity);

    boolean canBuy = true;
    do {
      updateLowS();
      Sell temp = this.sell.poll();

      System.out.println(
          "Checking lowest sell: " + temp + "lowest price=" + this.lowestSell);
      if (price >= this.lowestSell && temp != null) {
        if (temp.getQuantity() > quantity) {
          temp.setQuantity(temp.getQuantity() - quantity);
          this.sell.add(temp);
          System.out.println("Buy Success, " + "Buy: price= " + this.lowestSell
              + ", qunatity=" + quantity + "    (1)");
          quantity = 0;
        } else if (temp.getQuantity() == quantity) {
          quantity = 0;
          System.out.println("Buy Success, " + "Buy: price= " + lowestSell
              + ", qunatity=" + quantity + "    (2)");
        } else {
          quantity = Math.abs(quantity - temp.getQuantity());
          System.out.println("Buy Success: price= " + lowestSell + ", qunatity="
              + (temp.getQuantity()) + "    (3)");
          System.out.println("Remaining quantity: " + quantity);
        }
      } else if (temp != null) {
        this.sell.add(temp);
        canBuy = false;
      } else {
        canBuy = false;
      }
    } while (canBuy == true && quantity > 0);
    if (canBuy == false && quantity > 0) {
      this.addBuy(price, quantity);
      canBuy = false;
      updateHighB(price);
      System.out.println(
          "Add buy in market: Price=" + price + ", Quantity= " + quantity);
    }
  }

  public void buy(int quantity) {
    System.out.println("-------Buy------");
    System.out.println(" market selling order=" + this.sell.size());
    System.out.println("Order: Quantity=" + quantity);
    boolean canBuy = true;
    int count = 0;
    do {
      updateLowS();
      Sell temp = this.sell.poll();
      System.out.println(
          "Checking lowest sell: " + temp + "| lowest price=" + this.lowestSell);
      if (quantity > 0 && temp != null) {

        if (temp.getQuantity() > quantity) {
          temp.setQuantity(temp.getQuantity() - quantity);
          this.sell.add(temp);
          System.out.println("Buy Success, " + "Buy: price= " + this.lowestSell
              + ", qunatity=" + quantity + "    (1)");
          quantity = 0;
          count += quantity;
        } else if (temp.getQuantity() == quantity) {
          quantity = 0;
          count += quantity;
          System.out.println("Buy Success, " + "Buy: price= " + this.lowestSell
              + ", qunatity=" + quantity + "    (2)");
        } else {
          quantity = Math.abs(quantity - temp.getQuantity());
          count += temp.getQuantity();
          System.out.println("Buy Success: price= " + lowestSell + ", qunatity="
              + (temp.getQuantity()) + "    (3)");
          System.out.println("Remaining quantity: " + quantity);
        }
      } else {
        canBuy = false;
      }
    } while (canBuy == true);
    canBuy = false;
    System.out.println("Total Buy: Quantity= " + count);
  }

  public void sell(double price, int quantity) {
    if (isInRange(price) != true)
    return;
    System.out.println("------Sell------");
    System.out.println(" market buying order=" + this.buy.size());
    System.out.println("Order: Price=" + price + "| Quantity=" + quantity);
    boolean canSell = true;
    do {
      updateHighB();
      Buy temp = this.buy.poll();
      System.out.println("Checking highesgt buy: " + temp + "| highest price="
          + this.highestBuy);
      if (price <= highestBuy && temp != null) {

        if (temp.getQuantity() > quantity) {
          temp.setQuantity(temp.getQuantity() - quantity);
          this.buy.add(temp);
          System.out.println("Sell Success, " + "sell: price= "
              + this.highestBuy + ", qunatity=" + quantity + "    (1)");
          quantity = 0;
        } else if (temp.getQuantity() == quantity) {
          quantity = 0;
          System.out.println("Sell Success, " + "sell: price= "
              + this.highestBuy + ", qunatity=" + quantity + "    (2)");
        } else {
          quantity = Math.abs(quantity - temp.getQuantity());
          System.out.println("Sell Success: price= " + this.highestBuy
              + ", qunatity=" + (temp.getQuantity()) + "    (3)");
          System.out.println("Remaining quantity: " + quantity);
        }
      } else if (temp != null) {
        this.buy.add(temp);
        canSell = false;
      } else {
        canSell = false;
      }
    } while (canSell == true && quantity > 0);
    if (canSell == false && quantity > 0) {
      this.addSell(price, quantity);
      canSell = false;
      updateLowS(price);
      System.out.println(
          "Add sell in market: Price=" + price + ", Quantity= " + quantity);
    }
  }
  public void sell(int quantity) {

    System.out.println("------Sell------");
    System.out.println(" market buying order=" + this.buy.size());
    System.out.println("Order: Quantity=" + quantity);
    boolean canSell = true;
    int count = 0;
    do {
      updateHighB();
      Buy temp = this.buy.poll();
      System.out.println("Checking highesgt buy: " + temp + "| highest price="
          + this.highestBuy);
      if (temp != null) {

        if (temp.getQuantity() > quantity) {
          temp.setQuantity(temp.getQuantity() - quantity);
          this.buy.add(temp);
          System.out.println("Sell Success, " + "sell: price= "
              + this.highestBuy + ", qunatity=" + quantity + "    (1)");
          count += quantity;
          quantity = 0;
        } else if (temp.getQuantity() == quantity) {
          count += quantity;
          quantity = 0;
          System.out.println("Sell Success, " + "sell: price= "
              + this.highestBuy + ", qunatity=" + quantity + "    (2)");
        } else {
          quantity = Math.abs(quantity - temp.getQuantity());
          count += temp.getQuantity();
          System.out.println("Sell Success: price= " + this.highestBuy
              + ", qunatity=" + (temp.getQuantity()) + "    (3)");
          System.out.println("Remaining quantity: " + quantity);
        }
      } else {
        canSell = false;
      }
    } while (canSell == true && quantity > 0);
    if (canSell == false && quantity > 0) {
      canSell = false;
      System.out.println("Total Sell: Quantity= " + count);
    }
  }
  public static void main(String[] args) {
    System.out.println("-".repeat(60));
    OrderBook ob = new OrderBook();
    // ob.addBuy(1.05d, 30);
    // ob.addBuy(0.85d, 20);
    // ob.addBuy(1.45d, 80);
    // ob.addSell(1.6d, 100);
    // ob.addSell(1.5d, 50);
    // ob.addSell(1.8d, 50);
    ob.buy(1.0d, 100);;
    ob.buy(1.2d, 50);
    ob.checkAllBuy();
    ob.sell(1.5d, 50);
    ob.sell(1.9, 50);
    ob.checkAllSell();
    ob.buy(1.5d, 70);
    ob.buy(200);
    ob.buy(2.0d, 50);
    ob.checkAllBuy();
    ob.sell(300);
    
  }
}
