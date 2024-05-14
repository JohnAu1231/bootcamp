package com.bootcamp.demo2403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
  public static void main(String[] args) {
    Staff Vincent = new Staff("Vincent", 88888888, 01);
    System.out.println(Vincent);
    Staff John = new Staff("John", 12345678, 02);
    Staff Vincent2 = new Staff("Vincent", 88888888, 01);
    System.out.println(Vincent.equals(John));
    System.out.println(Vincent.equals(Vincent2));
    
    List<Order> Orders1 = new ArrayList<>(Arrays.asList(new Order(1), new Order(2)));
    Customer c1 = new Customer("Vincent");
    c1.add(new Order(01));
    Customer c2 = new Customer("Vincent");
    c2.add(new Order(01));

    System.out.println(c1.equals(c2));

    Staff t1 = Staff.builder() //
      .name("Vincent") //
      .phone(88888888)
      .id(01)
      .build();
    
      System.out.println(t1);
  }
}
