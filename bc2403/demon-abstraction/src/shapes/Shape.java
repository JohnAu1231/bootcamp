package shapes;

import java.math.BigDecimal;

//1. 100% abstraction -> no any implementation in interface
//2. interface is implicitly public 
//3.  No instance variable in interface
//4. you can only define public static final variable
//5. interface is a contract that the class should implement



public interface Shape {
  // public static final String s = "hello";
  String s = "hello";

  BigDecimal PI =  BigDecimal.valueOf(Math.PI);

  double area();

 String print();

 //static method, with implementation class
//  public static double area(Square[] squares) {

//  }
//  public static double are(Circle[] circles) {

//  }
// }

  public static double area(Shape[] shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Shape s : shapes) 
      sum = sum.add(BigDecimal.valueOf((s.area())));
    return sum.doubleValue();
  }

  public static void main(String[] args) {
    
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle();
    shapes[1] = new Square();
    shapes[2] = new Circle();
    Shape shape = new Shape();
  }
}