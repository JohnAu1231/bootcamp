package shape;

import java.math.BigDecimal;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface Shape {
  // attribute
  double area();

  //default method -> instance method

  //static method
  static double area(List<Shape> shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) {
      sum = sum.add(BigDecimal.valueOf(s.area()));
    }
    return sum.doubleValue();
  }

  static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) {
      sum = sum.add(BigDecimal.valueOf(s.area()));
    }
    return sum.doubleValue();
  }

  static <T extends Collection<Number>> double area4(T shape) {
    //Queue<Number>
    //Set<Number>
    //List<Number>
    return -1;
  }

  static <T extends Number> double area5(Queue<T> shape) {
    return -1;
  }

  static double area6(Queue<? extends Number> shape) {
    return -1;
  }

  static double area7(Queue<? super Long> shape) {
    return -1;
  }

  public static void main(String[] args) {
    
    Circle c = new Circle(3.0d);
    Square s =new Square(5.0d);
    List<Shape> ls = new ArrayList<>();
    ls.add(c);
    ls.add(s);
    System.out.println(ls);

    List<Object> ls2 = new ArrayList<>();
    ls.add(c);
    ls.add(s);
    // for (Object o: ls2) {
      // o.area();   // compile error because area() provide in Shape, object does not provide
    // }
    Queue<Long> ql = new LinkedList<>();
    ql.add(1L);
    Shape.area5(ql);

    Queue<Number> q2 = new LinkedList<>();
    q2.add(1L);
    Shape.area4(q2);

    Set<Number> sn = new HashSet<>();
    Shape.area4(sn);
    System.out.println(Shape.area4(new LinkedList<>()));

    Shape.area7(ql);
    Queue<Short> qs = new LinkedList<>();
    // Shape.area7(sn); compile error, area7() super Long

    Queue<Number> qn2 = new LinkedList<>();
    Shape.area7(qn2);  // Number is parent class of Long (super)
    
  }
}
