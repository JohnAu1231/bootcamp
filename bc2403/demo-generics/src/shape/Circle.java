package shape;

import java.math.BigDecimal;

public class Circle implements Shape{

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

 
}
