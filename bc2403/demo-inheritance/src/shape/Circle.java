package shape;

import java.math.BigDecimal;

public class Circle extends Shape{
  
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(Math.PI))) //
    .doubleValue();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (!(o instanceof Circle))
      return false;
    Circle circle = (Circle) o;
    return this.radius == circle.getRadius();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area());
    Circle c2 = new Circle(2.0);
    Circle c3 = c1;
    String g = "hello";
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    System.out.println(c1.equals(g));
   

  }
}
