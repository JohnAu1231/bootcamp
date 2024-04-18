package shapes;

import java.math.BigDecimal;

public class Square implements Shape{
  
  private double length;

  @Override 
  public double area() {
    return BigDecimal.valueOf(length) //
          .multiply(BigDecimal.valueOf(length)) //
          .doubleValue();
  }

  @Override
  public String print() {
    return String.valueOf(this.length);
  }
}
