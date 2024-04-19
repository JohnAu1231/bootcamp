package shapes;

import java.math.BigDecimal;

//1. You can implements more than on interface
//2. 100% abstraction -> no any implementation in interface
//3. interface is implicitly public 
//4  No instance variable in interface
public class Circle implements Shape {

  private double radius;

  // public Circle(double radius) {
  //   this.radius = radius;
  // }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius).multiply(Shape.PI)).doubleValue();
  }
  
  @Override
  public String print() {
    return String.valueOf((this.radius));
  }

    public void sleep() {
      System.out.println("sleep");
      
    }

  public static void main(String[] args) {
    
    Shape s = new Circle(); // OK
    s.area();
    s.print();
  }
}
