package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


//Getter is a field/class level annotation
@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
  @Getter @NonNull private String name;
  @Setter private int age;

  public static void main(String[] args) {
    Student s1 = new Student("Vincent", 4);
    System.out.println(s1.getName());
   // System.out.println(s1.getAge());   // @Getter before private = this statment have method ,before class = build in class

    s1.setAge(5);
    Student s2 = new Student("Vincent");
  }
}
