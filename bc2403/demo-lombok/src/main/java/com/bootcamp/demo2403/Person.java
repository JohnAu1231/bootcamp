package com.bootcamp.demo2403;


import lombok.Value;
import lombok.With;

//read-only
@Value  //AllargsContructor + getter
public class Person {
  @With
  private String name; //final
  @With
  private int age; //final

  public static void main(String[] args) {
     Person p1 = new Person("Vincent", 5);
     System.out.println(p1.getAge());
     System.out.println(p1.getName());

     Person p2 = new Person("Vincent", 5);
     System.out.println(p1.equals(p2));
     System.out.println(p1);

  
     
  }
}
